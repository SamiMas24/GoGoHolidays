package com.example.gogoholidays.models.dto;

import com.example.gogoholidays.models.dto.SmalDTO.SmalAdresseDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalOffreDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.gogoholidays.models.entity.Adresse;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.Trajet;
import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Future;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Builder
public class DestinationDTO {
    private int id;

    private String normeCovid;
    private Set<SmalOffreDTO> offres;

    private SmalAdresseDTO adresseDestination;

    private List<SmalTrajetDTO> depart;

    private List<SmalTrajetDTO> arrive;

}
