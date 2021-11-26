package com.example.gogoholidays.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "trajet")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = false)
    @JoinColumn(name = "depart_destination", foreignKey = @ForeignKey(name = "FK_depart_destination"))
    private Destination depart;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = false)
    @JoinColumn(name = "arrive_destination", foreignKey = @ForeignKey(name = "FK_arrive_destination"))
    private Destination arrive;

    @ManyToOne
    @JoinColumn(name = "transport_trajet", foreignKey = @ForeignKey(name = "FK_transport_trajet"))
    private Transport transport;

}