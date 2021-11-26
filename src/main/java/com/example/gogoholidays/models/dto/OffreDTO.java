package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class OffreDTO {
    private int id;
    private String titre;
    private TypeOffre type;
    private double prix;
    private int nbplacetotal;
    private List<SmalDestinationDTO> destinations;
}
