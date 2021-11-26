package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.form.DestinationForm;
import org.springframework.stereotype.Service;

@Service
public class DestinationMapper implements BaseMapper<DestinationDTO, DestinationForm, Destination>{
    private final AdresseMapper adresseMapper;
    private final TrajetMapper trajetMapper;

    public DestinationMapper(AdresseMapper adresseMapper, TrajetMapper trajetMapper) {
        this.adresseMapper = adresseMapper;
        this.trajetMapper = trajetMapper;
    }

    @Override
    public DestinationDTO toDto(Destination entity) {
        if(entity==null)return null;
        return DestinationDTO.builder()
                .id(entity.getId())
                .dateDepart(entity.getDateDepart())
                .dateArrive(entity.getDateArrive())
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMapper.toDtoSmall(entity.getAdresseDestination()))
                .build();
    }
    public SmalDestinationDTO toSmallDto(Destination entity) {
        if(entity==null)return null;
        return SmalDestinationDTO.builder()
                .id(entity.getId())
                .dateDepart(entity.getDateDepart())
                .dateArrive(entity.getDateArrive())
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMapper.toDtoSmall(entity.getAdresseDestination()))
                .depart(trajetMapper.toSmallDto(entity.getDepartDestination()))
                .build();
    }

    @Override
    public Destination formToEntity(DestinationForm form) {
        return null;
    }
}
