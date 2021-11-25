package com.example.gogoholidays.models.dto.SmalDTO;

import com.example.gogoholidays.models.entity.Transport;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmalTrajetDTO {
    private int id;
    private String transport;
}
