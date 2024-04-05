package com.example.server.repository;

import com.example.server.domain.SubjectRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRequirementRepository extends JpaRepository<SubjectRequirement, Integer> {
}