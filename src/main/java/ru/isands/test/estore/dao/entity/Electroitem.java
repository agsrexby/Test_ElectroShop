package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "electroitem")
public class Electroitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etypeid")
    private Electrotype etypeid;

    @NotNull
    @Column(name = "price", nullable = false)
    private Long price;

    @NotNull
    @Column(name = "count", nullable = false)
    private Integer count;

    @NotNull
    @Column(name = "archive", nullable = false)
    private Boolean archive = false;

    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @OneToMany(mappedBy = "electroitemid")
    private Set<Electroshop> electroshops = new LinkedHashSet<>();

    @OneToMany(mappedBy = "electroid")
    private Set<Purchase> purchases = new LinkedHashSet<>();

}