package com.example.server.repository;

import com.example.server.domain.Scene;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SceneRepository extends JpaRepository<Scene, Integer> {
}