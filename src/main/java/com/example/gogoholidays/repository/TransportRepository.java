package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, Integer> {
}