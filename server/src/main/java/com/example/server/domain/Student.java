package com.example.server.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "student", schema = "public")
public class Student {
    @Id
    @Column(name = "id", nullable = false, length = 6)
    private String id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "class_id", nullable = false)
    private Class classField;

    @OneToMany(mappedBy = "student")
    private Set<Absence> absences = new LinkedHashSet<>();

    @OneToMany(mappedBy = "student")
    private Set<Delay> delays = new LinkedHashSet<>();

    @OneToMany(mappedBy = "student")
    private Set<Grade> grades = new LinkedHashSet<>();

    @OneToMany(mappedBy = "student")
    private Set<Problem> problems = new LinkedHashSet<>();

}