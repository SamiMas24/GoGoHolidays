package com.example.gogoholidays.models.dto.SmalDTO;

import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class SmalOffreDTO {
    private LocalDate dateDepart;
    private LocalDate dateArrive;
    private String titre;
    private TypeOffre type;
    private double prix;
    private int nbplacetotal;
}
