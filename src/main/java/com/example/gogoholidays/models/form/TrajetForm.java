package com.example.gogoholidays.models.form;

import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.entity.Transport;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated

public class TrajetForm {
    private int id;
}
