package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.TransportDTO;
import com.example.gogoholidays.models.entity.Transport;
import com.example.gogoholidays.models.form.TransportForm;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
@Service
public class TransportMapper implements BaseMapper<TransportDTO, TransportForm, Transport>{
    private final TrajetMapper mapperT;

    public TransportMapper(TrajetMapper mapperT) {
        this.mapperT = mapperT;
    }

    @Override
    public TransportDTO toDto(Transport entity) {
        if(entity==null)return null;
        return TransportDTO.builder()
                .nom(entity.getNom())
                .trajetTransport(entity.getTrajetTransport()
                        .stream()
                        .map(mapperT::toSmallDto)
                        .collect(Collectors.toList())
                )
                .build();
    }

    @Override
    public Transport formToEntity(TransportForm form) {
        return null;
    }
}
