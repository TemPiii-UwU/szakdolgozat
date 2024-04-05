package com.example.server.repository;

import com.example.server.domain.TeacherPreferredTime;
import com.example.server.domain.TeacherPreferredTimeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherPreferredTimeRepository extends JpaRepository<TeacherPreferredTime, TeacherPreferredTimeId> {
}