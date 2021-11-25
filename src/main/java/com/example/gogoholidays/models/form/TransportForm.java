package com.example.gogoholidays.models.form;

import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@Validated
public class TransportForm {
    private int id;
    @NotBlank
    private String nom;
}
