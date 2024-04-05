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
@Table(name = "timeslot", schema = "public", indexes = {
        @Index(name = "timeslot_day_hour_class_id_teacher_id_subject_id_classroom__key", columnList = "day, hour, class_id, teacher_id, subject_id, classroom_id, year", unique = true)
})
public class Timeslot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "day", nullable = false, length = 10)
    private String day;

    @Column(name = "hour", nullable = false)
    private Short hour;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "class_id", nullable = false)
    private Class classField;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "classroom_id", nullable = false)
    private Classroom classroom;

    @Column(name = "year", nullable = false)
    private Short year;

    @OneToMany(mappedBy = "timeslot")
    private Set<Absence> absences = new LinkedHashSet<>();

    @OneToMany(mappedBy = "timeslot")
    private Set<Delay> delays = new LinkedHashSet<>();

    @OneToMany(mappedBy = "timeslot")
    private Set<Grade> grades = new LinkedHashSet<>();

    @OneToMany(mappedBy = "timeslot")
    private Set<Problem> problems = new LinkedHashSet<>();

}