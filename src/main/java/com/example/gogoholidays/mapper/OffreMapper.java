package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.dto.OffreDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalOffreDTO;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.form.OffreForm;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class OffreMapper implements BaseMapper<OffreDTO, OffreForm, Offre> {
    private final DestinationMapper destinationMapper;
    public OffreMapper(DestinationMapper destinationMapper) {
        this.destinationMapper = destinationMapper;
    }

    @Override
    public OffreDTO toDto(Offre entity) {
        if(entity==null)return null;
        return OffreDTO.builder()
                .id(entity.getId())
                .titre(entity.getTitre())
                .type(entity.getType())
                .prix(entity.getPrix())
                .nbplacetotal(entity.getNbplacetotal())
                .dateDepart(entity.getDateDepart())
                .dateArrive(entity.getDateArrive())
                .destinations(
                        entity.getDestinations()
                                .stream()
                                .map(destinationMapper::toSmallDto)
                                .collect(Collectors.toList())
                )
                .build();
    }

    @Override
    public Offre formToEntity(OffreForm form) {
        Offre entity=new Offre();
        entity.setId(form.getId());
        entity.setTitre(form.getTitre());
        entity.setType(form.getType());
        entity.setPrix(form.getPrix());
        entity.setNbplacetotal(form.getNbplacetotal());
        entity.setDateDepart(form.getDateDepart());
        entity.setDateArrive(form.getDateArrive());
        return entity;
    }

}
