package com.example.server.repository;

import com.example.server.domain.TeacherSubject;
import com.example.server.domain.TeacherSubjectId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherSubjectRepository extends JpaRepository<TeacherSubject, TeacherSubjectId> {
}