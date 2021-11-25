package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository extends JpaRepository<Trajet, Integer> {
}