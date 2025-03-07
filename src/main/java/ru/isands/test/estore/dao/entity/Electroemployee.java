package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "electroemployee")
public class Electroemployee {
    @EmbeddedId
    private ElectroemployeeId id;

    @MapsId("employeeid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeeid", nullable = false)
    private Employee employeeid;

    @MapsId("electrotypeid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "electrotypeid", nullable = false)
    private Electrotype electrotypeid;
}