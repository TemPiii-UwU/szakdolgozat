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
@Table(name = "subject", schema = "public")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "subject")
    private Set<SubjectRequirement> subjectRequirements = new LinkedHashSet<>();

    @OneToMany(mappedBy = "subject")
    private Set<Timeslot> timeslots = new LinkedHashSet<>();

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }
}