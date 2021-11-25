package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}