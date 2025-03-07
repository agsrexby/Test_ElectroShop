package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "electroid")
    private Electroitem electroid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeid")
    private Employee employeeid;

    @NotNull
    @Column(name = "purchasedate", nullable = false)
    private Instant purchasedate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeid")
    private Purchasetype typeid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shopid")
    private Shop shopid;

}