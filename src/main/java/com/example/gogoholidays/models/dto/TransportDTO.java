package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.gogoholidays.models.entity.Trajet;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TransportDTO {
    private int id;
    private String nom;

    private List<SmalTrajetDTO> trajetTransport;
}
