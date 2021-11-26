package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.TypeOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
    @Query(value = "SELECT * FROM destination WHERE dest_offre=?1",nativeQuery = true)
    List<Destination> getByOffre(Integer dest_offre);

}