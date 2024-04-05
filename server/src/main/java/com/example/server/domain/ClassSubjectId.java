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
public class ClassSubjectId implements Serializable {
    private static final long serialVersionUID = 6734695166399907339L;
    @Column(name = "class_id", nullable = false)
    private Integer classId;

    @Column(name = "subject_id", nullable = false)
    private Integer subjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClassSubjectId entity = (ClassSubjectId) o;
        return Objects.equals(this.classId, entity.classId) &&
                Objects.equals(this.subjectId, entity.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, subjectId);
    }

}