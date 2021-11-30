package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalOffreDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.form.DestinationForm;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

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
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMapper.toDtoSmall(entity.getAdresseDestination()))
                .offres(entity.getOffres()
                        .stream()
                        .map(this::toDto2)
                        .collect(Collectors.toSet())
                )
                .build();
    }
    public SmalDestinationDTO toSmallDto(Destination entity) {
        if(entity==null)return null;
        return SmalDestinationDTO.builder()
                .id(entity.getId())
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMapper.toDtoSmall(entity.getAdresseDestination()))
                //.depart(trajetMapper.toSmallDto(entity.getDepartDestination()))

                .build();
    }

    @Override
    public Destination formToEntity(DestinationForm form) {
        return null;
    }

    public SmalOffreDTO toDto2(Offre entity) {
        if(entity==null)return null;
        return SmalOffreDTO.builder()
                .titre(entity.getTitre())
                .type(entity.getType())
                .prix(entity.getPrix())
                .nbplacetotal(entity.getNbplacetotal())
                .build();
    }
}
