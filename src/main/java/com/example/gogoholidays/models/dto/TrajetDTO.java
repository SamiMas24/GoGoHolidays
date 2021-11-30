package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Transport;
import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class TrajetDTO {
    private int id;

    private SmalDestinationDTO departDestination;

    private SmalDestinationDTO arriveDestination;

    private TrajetDTO.TransportDTO transport;

    @Data
    @Builder
    public static class TransportDTO{
        private String nom;
    }
}
