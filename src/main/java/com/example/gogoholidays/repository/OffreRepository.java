package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.TypeOffre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre, Integer> {
    List<Offre> getChambreByType(TypeOffre type);
}