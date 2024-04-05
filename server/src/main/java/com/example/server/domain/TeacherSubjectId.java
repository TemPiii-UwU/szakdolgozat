package com.example.server.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@Embeddable
public class TeacherSubjectId implements Serializable {
    private static final long serialVersionUID = 7091619460867239865L;
    @Column(name = "teacher_id", nullable = false, length = 6)
    private String teacherId;

    @Column(name = "subject_id", nullable = false)
    private Integer subjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TeacherSubjectId entity = (TeacherSubjectId) o;
        return Objects.equals(this.teacherId, entity.teacherId) &&
                Objects.equals(this.subjectId, entity.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, subjectId);
    }

}