package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrajetRepository extends JpaRepository<Trajet, Integer> {

    @Query(value = "" +
            "SELECT * FROM trajet t WHERE t.trajet_depart in(SELECT d.destination_id FROM conserne d JOIN offre o on d.offre_id=o.id WHERE o.id=?1)" +
            "or t.trajet_arrive in(SELECT d.destination_id FROM conserne d JOIN offre o on d.offre_id=o.id WHERE o.id=?1) ",nativeQuery = true)
    List<Trajet> findAllByOffre(Integer id);

}