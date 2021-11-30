package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "destination")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String normeCovid;
    /*@ManyToOne
    @JoinColumn(name = "dest_offre", foreignKey = @ForeignKey(name = "FK_desti_offre"))
    private Offre destination;*/

    @ManyToMany(mappedBy = "destinations", fetch = FetchType.LAZY)
    private List<Offre> offres;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = false)
    @JoinColumn(name = "adresse_destination", foreignKey = @ForeignKey(name = "FK_adresse_destination"))
    private Adresse adresseDestination;


    @OneToMany(mappedBy = "trajetDepart")
    private List<Trajet> departDestination;

    @OneToMany(mappedBy = "trajetArrive")
    private List<Trajet> arriveDestination;
    /*@ManyToOne(mappedBy = "depart")
    private List<Trajet> departDestination;

    @ManyToOne(mappedBy = "arrive")
    private List<Trajet> arriveDestination;*/
}