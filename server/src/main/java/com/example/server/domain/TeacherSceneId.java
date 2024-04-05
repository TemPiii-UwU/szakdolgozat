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
public class TeacherSceneId implements Serializable {
    private static final long serialVersionUID = 2986093431508395470L;
    @Column(name = "teacher_id", nullable = false, length = 6)
    private String teacherId;

    @Column(name = "scene_id", nullable = false)
    private Integer sceneId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TeacherSceneId entity = (TeacherSceneId) o;
        return Objects.equals(this.teacherId, entity.teacherId) &&
                Objects.equals(this.sceneId, entity.sceneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, sceneId);
    }

}