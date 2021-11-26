package com.example.gogoholidays.models.dto.SmalDTO;

import com.example.gogoholidays.models.entity.Transport;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class SmalTrajetDTO {
    private int id;
    private String transport;
    private SmalTrajetDTO.SmalDestinationDTO depart;
    private SmalTrajetDTO.SmalDestinationDTO arrive;

    @Data
    @Builder
    public static class SmalDestinationDTO {
        private int id;
        private LocalDate dateDepart;
        private LocalDate dateArrive;
        private String normeCovid;
        private SmalAdresseDTO adresseDestination;
    }
}
