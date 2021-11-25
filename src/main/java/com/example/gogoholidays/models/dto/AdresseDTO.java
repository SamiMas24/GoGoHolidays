package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.entity.Destination;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Data
@Builder
public class AdresseDTO {
    private int id;
    private String pays;
    private String ville;
    private String rue;
    private int numero;

    private SmalDestinationDTO conserneDestination;
}
