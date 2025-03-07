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
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 250)
    @NotNull
    @Column(name = "name", nullable = false, length = 250)
    private String name;

    @NotNull
    @Column(name = "address", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String address;

    @OneToMany(mappedBy = "shopid")
    private Set<Employee> employees = new LinkedHashSet<>();

    @OneToMany(mappedBy = "shopid")
    private Set<Purchase> purchases = new LinkedHashSet<>();

}