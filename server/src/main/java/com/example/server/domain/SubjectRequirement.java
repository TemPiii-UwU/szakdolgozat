package com.example.server.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@ToString
@Entity
@Table(name = "subject_requirement", schema = "public", indexes = {
        @Index(name = "subject_requirement_field_grade_subject_id_key", columnList = "field, grade, subject_id", unique = true)
})
public class SubjectRequirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "field", nullable = false, length = 300)
    private String field;

    @Column(name = "grade", nullable = false)
    private Short grade;

    @Column(name = "period", nullable = false)
    private Short period;

    @Column(name = "advanced")
    private Boolean advanced;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

}