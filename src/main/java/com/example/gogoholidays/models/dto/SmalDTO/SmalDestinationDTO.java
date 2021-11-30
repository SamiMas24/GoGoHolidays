package com.example.gogoholidays.models.dto.SmalDTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class SmalDestinationDTO {
    private int id;
    private String normeCovid;
    private SmalAdresseDTO adresseDestination;
    //private SmalTrajetDTO depart;
}
