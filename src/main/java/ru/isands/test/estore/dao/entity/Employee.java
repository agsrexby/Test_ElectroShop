package ru.isands.test.estore.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "lastname", nullable = false, length = 100)
    private String lastname;

    @Size(max = 100)
    @NotNull
    @Column(name = "firstname", nullable = false, length = 100)
    private String firstname;

    @Size(max = 100)
    @Column(name = "patronymic", length = 100)
    private String patronymic;

    @NotNull
    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("employee-positiontype")
    @JoinColumn(name = "positionid")
    private Positiontype positionid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("emplooyee-shop")
    @JoinColumn(name = "shopid")
    private Shop shopid;

    @NotNull
    @Column(name = "gender", nullable = false)
    private Boolean gender = false;

    @OneToMany(mappedBy = "employeeid")
    @JsonIgnore
    private Set<Purchase> purchases = new LinkedHashSet<>();

}