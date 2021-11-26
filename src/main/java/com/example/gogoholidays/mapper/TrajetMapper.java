package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.gogoholidays.models.dto.TrajetDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Trajet;
import com.example.gogoholidays.models.form.TrajetForm;
import org.springframework.stereotype.Service;

@Service
public class TrajetMapper implements BaseMapper<TrajetDTO, TrajetForm, Trajet> {
    private final AdresseMapper adresseMapper;

    public TrajetMapper(AdresseMapper adresseMapper) {
        this.adresseMapper = adresseMapper;
    }

    @Override
    public TrajetDTO toDto(Trajet entity) {
        return null;
    }
    public SmalTrajetDTO toSmallDto(Trajet entity) {
        if(entity==null)return null;
        return SmalTrajetDTO.builder()
                .id(entity.getId())
                .transport(entity.getTransport().getNom())
                .depart(destination(entity.getDepart()))
                .arrive(destination(entity.getArrive()))
                .build();
    }
    @Override
    public Trajet formToEntity(TrajetForm form) {
        return null;
    }
    public SmalTrajetDTO.SmalDestinationDTO destination(Destination entity){
        return SmalTrajetDTO.SmalDestinationDTO.builder()
                .id(entity.getId())
                .dateDepart(entity.getDateDepart())
                .dateArrive(entity.getDateArrive())
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMapper.toDtoSmall(entity.getAdresseDestination()))
                .build();
    }
}
