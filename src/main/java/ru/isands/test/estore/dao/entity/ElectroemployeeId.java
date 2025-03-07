package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ElectroemployeeId implements Serializable {
    private static final long serialVersionUID = -1871554744172396724L;
    @NotNull
    @Column(name = "employeeid", nullable = false)
    private Long employeeid;

    @NotNull
    @Column(name = "electrotypeid", nullable = false)
    private Long electrotypeid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ElectroemployeeId entity = (ElectroemployeeId) o;
        return Objects.equals(this.electrotypeid, entity.electrotypeid) &&
                Objects.equals(this.employeeid, entity.employeeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(electrotypeid, employeeid);
    }

}