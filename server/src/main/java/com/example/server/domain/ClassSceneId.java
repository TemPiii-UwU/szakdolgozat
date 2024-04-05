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
public class ClassSceneId implements Serializable {
    private static final long serialVersionUID = -3596648052276413086L;
    @Column(name = "class_id", nullable = false)
    private Integer classId;

    @Column(name = "scene_id", nullable = false)
    private Integer sceneId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClassSceneId entity = (ClassSceneId) o;
        return Objects.equals(this.classId, entity.classId) &&
                Objects.equals(this.sceneId, entity.sceneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, sceneId);
    }

}