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
public class TeacherPreferredTimeId implements Serializable {
    private static final long serialVersionUID = -315832305656275295L;
    @Column(name = "teacher_id", nullable = false, length = 6)
    private String teacherId;

    @Column(name = "preferred_time_id", nullable = false)
    private Integer preferredTimeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TeacherPreferredTimeId entity = (TeacherPreferredTimeId) o;
        return Objects.equals(this.preferredTimeId, entity.preferredTimeId) &&
                Objects.equals(this.teacherId, entity.teacherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferredTimeId, teacherId);
    }

}