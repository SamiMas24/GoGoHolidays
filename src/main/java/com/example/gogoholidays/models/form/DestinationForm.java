package com.example.gogoholidays.models.form;

import com.example.gogoholidays.models.dto.SmalDTO.SmalAdresseDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.gogoholidays.models.entity.Offre;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Validated
public class DestinationForm {
    private int id;
    private LocalDate dateDepart;
    private LocalDate dateArrive;
    private String normeCovid;
}
