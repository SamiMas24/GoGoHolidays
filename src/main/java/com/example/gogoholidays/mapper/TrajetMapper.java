package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.gogoholidays.models.dto.TrajetDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.entity.Trajet;
import com.example.gogoholidays.models.entity.Transport;
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
        if(entity==null)return null;
        return TrajetDTO.builder()
                .id(entity.getId())
                .transport(transport(entity.getTransport()))
                .departDestination(destination(entity.getTrajetDepart()))
                .arriveDestination(destination(entity.getTrajetArrive()))
                .build();
    }
    public  TrajetDTO.TransportDTO transport(Transport entity){
        if(entity==null)return null;
        return TrajetDTO.TransportDTO.builder()
                .nom(entity.getNom())
                .build();
    }

    public SmalTrajetDTO toSmallDto(Trajet entity) {
        if(entity==null)return null;
        return SmalTrajetDTO.builder()
                .id(entity.getId())
                .transport(entity.getTransport().getNom())
                /*.depart(destination(entity.getDepart()))
                .arrive(destination(entity.getArrive()))*/
               /* .depart(destination(entity.getTrajetDepart()))
                .arrive(destination(entity.getTrajetArrive()))*/
                .build();
    }

    @Override
    public Trajet formToEntity(TrajetForm form) {
        return null;
    }

    public SmalDestinationDTO destination(Destination entity){
        return SmalDestinationDTO.builder()
                .id(entity.getId())
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMapper.toDtoSmall(entity.getAdresseDestination()))
                .build();
    }


}
