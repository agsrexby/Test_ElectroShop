FROM amazoncorretto:11 AS builder
WORKDIR /application
COPY . .
RUN --mount=type=cache,target=/root/.m2  mvn clean install -Dmaven.test.skip

FROM amazoncorretto:11 AS layers
WORKDIR /application
COPY --from=builder /application/target/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM amazoncorretto:11
VOLUME /tmp
RUN yum -y install shadow-utils
RUN useradd -ms /bin/bash spring-user
USER spring-user
COPY --from=layers /application/dependencies/ ./
COPY --from=layers /application/spring-boot-loader/ ./
COPY --from=layers /application/snapshot-dependencies/ ./
COPY --from=layers /application/application/ ./

ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
