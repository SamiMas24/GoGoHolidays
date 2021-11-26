package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "transport")
    private List<Trajet> trajetTransport;
}