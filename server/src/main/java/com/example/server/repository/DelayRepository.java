package com.example.server.repository;

import com.example.server.domain.Delay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DelayRepository extends JpaRepository<Delay, Integer> {
}