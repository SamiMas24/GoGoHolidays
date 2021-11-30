package com.example.gogoholidays.repository;

import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.TypeOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre, Integer> {
    List<Offre> getOffreByType(TypeOffre type);
    /*@Query(value = "SELECT  DISTINCT(o.id),o.nbplacetotal,o.prix,o.titre,o.type FROM offre o JOIN destination d on o.id=d.dest_offre \n" +
            "LEFT JOIN trajet de on de.arrive_destination=d.id \n" +
            "LEFT JOIN trajet a on a.depart_destination=d.id;",nativeQuery = true)
    List<Offre> getAllOffre();*/
}