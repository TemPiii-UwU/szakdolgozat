package com.example.server.repository;

import com.example.server.domain.TeacherScene;
import com.example.server.domain.TeacherSceneId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherSceneRepository extends JpaRepository<TeacherScene, TeacherSceneId> {
}