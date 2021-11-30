package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Table(name = "offre")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate dateDepart;

    @Column(nullable = false)
    private LocalDate dateArrive;

    @Column(nullable = false)
    private String titre;

    @Enumerated( EnumType.STRING )
    private TypeOffre type;

    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private double prix;

    @Column(nullable = false)
    private int nbplacetotal;

    /*@OneToMany(mappedBy = "destination")
    private List<Destination> destinations;*/

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "conserne",
            joinColumns = @JoinColumn(name = "offre_id"),
            inverseJoinColumns = @JoinColumn(name = "destination_id"))
    private Set<Destination> destinations;

}