package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class OffreDTO {

    private String titre;
    private TypeOffre type;
    private double prix;
    private int nbplacetotal;
}
