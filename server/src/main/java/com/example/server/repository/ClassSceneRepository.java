package com.example.server.repository;

import com.example.server.domain.ClassScene;
import com.example.server.domain.ClassSceneId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassSceneRepository extends JpaRepository<ClassScene, ClassSceneId> {
}