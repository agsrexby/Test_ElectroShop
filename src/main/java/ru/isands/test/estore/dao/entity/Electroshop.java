package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "electroshop")
public class Electroshop {
    @EmbeddedId
    private ElectroshopId id;

    @MapsId("shopid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "shopid", nullable = false)
    private Shop shopid;

    @MapsId("electroitemid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "electroitemid", nullable = false)
    private Electroitem electroitemid;

    @NotNull
    @Column(name = "count", nullable = false)
    private Integer count;

}