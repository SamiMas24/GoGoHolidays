package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "transport")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nom;

    @OneToOne(mappedBy = "transport")
    private Trajet trajetTransport;
}