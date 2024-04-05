package com.example.server.repository;

import com.example.server.domain.ClassSubject;
import com.example.server.domain.ClassSubjectId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassSubjectRepository extends JpaRepository<ClassSubject, ClassSubjectId> {
}