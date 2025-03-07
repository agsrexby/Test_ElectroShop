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
public class ElectroshopId implements Serializable {
    private static final long serialVersionUID = -8903274964967167761L;
    @NotNull
    @Column(name = "shopid", nullable = false)
    private Long shopid;

    @NotNull
    @Column(name = "electroitemid", nullable = false)
    private Long electroitemid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ElectroshopId entity = (ElectroshopId) o;
        return Objects.equals(this.electroitemid, entity.electroitemid) &&
                Objects.equals(this.shopid, entity.shopid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(electroitemid, shopid);
    }

}