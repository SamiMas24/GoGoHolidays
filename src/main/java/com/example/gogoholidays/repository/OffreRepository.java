package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.TypeOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre, Integer> {
    List<Offre> getOffreByType(TypeOffre type);
    @Query(value = "SELECT * FROM offre",nativeQuery = true)
    List<Offre> getAllOffre();
}