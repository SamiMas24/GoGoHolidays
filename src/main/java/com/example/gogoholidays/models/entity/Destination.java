package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "destination")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDate dateDepart;
    @Column(nullable = false)
    private LocalDate dateArrive;
    private String normeCovid;
    @ManyToOne
    @JoinColumn(name = "dest_offre", foreignKey = @ForeignKey(name = "FK_desti_offre"))
    private Offre destination;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = false)
    @JoinColumn(name = "adresse_destination", foreignKey = @ForeignKey(name = "FK_adresse_destination"))
    private Adresse adresseDestination;



    @OneToOne(mappedBy = "depart")
    private Trajet departDestination;

    @OneToOne(mappedBy = "arrive")
    private Trajet arriveDestination;
}