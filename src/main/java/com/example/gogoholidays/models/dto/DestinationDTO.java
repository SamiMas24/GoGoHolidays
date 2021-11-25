package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.dto.SmalDTO.SmalAdresseDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.gogoholidays.models.entity.Adresse;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.Trajet;
import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Future;
import java.time.LocalDate;
@Data
@Builder
public class DestinationDTO {
    private int id;
    @Future
    private LocalDate dateDepart;
    @Future
    private LocalDate dateArrive;
    private String normeCovid;
    private Offre destination;

    private SmalAdresseDTO adresseDestination;

    private SmalTrajetDTO depart;

    private SmalTrajetDTO arrive;

    @Data
    @Builder
    public static class OffreDTO{
        private String titre;
        private TypeOffre type;
        private double prix;
        private int nbplacetotal;
    }
}
