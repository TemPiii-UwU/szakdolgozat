package com.example.server.repository;

import com.example.server.domain.PreferredTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferredTimeRepository extends JpaRepository<PreferredTime, Integer> {
}