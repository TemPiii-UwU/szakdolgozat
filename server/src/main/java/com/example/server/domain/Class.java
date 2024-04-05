package com.example.server.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "class", schema = "public", indexes = {
        @Index(name = "class_year_grade_group_key", columnList = "year, grade, group", unique = true)
})
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "year", nullable = false)
    private Short year;

    @Column(name = "grade", nullable = false)
    private Short grade;

    @Column(name = "\"group\"", length = Integer.MAX_VALUE)
    private String group;

    @Column(name = "field", nullable = false, length = 300)
    private String field;

    @OneToMany(mappedBy = "classField")
    private Set<Timeslot> timeslots = new LinkedHashSet<>();

}