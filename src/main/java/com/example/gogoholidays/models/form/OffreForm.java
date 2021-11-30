package com.example.gogoholidays.models.form;

import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.TypeOffre;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Validated
public class OffreForm {
    private int id;
    @NotBlank
    private String titre;
    private TypeOffre type;
    @Min(0)
    private double prix;
    @Min(1)
    private int nbplacetotal;

    private LocalDate dateDepart;

    private LocalDate dateArrive;

}
