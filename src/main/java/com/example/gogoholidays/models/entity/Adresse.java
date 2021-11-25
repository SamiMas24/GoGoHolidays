package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "adresse")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String pays;
    @Column(nullable = false)
    private String ville;
    @Column(nullable = false)
    private String rue;
    @Column(nullable = false)
    private int numero;

    @OneToOne(mappedBy = "adresseDestination")
    private Destination conserneDestination;
}