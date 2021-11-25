package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.OffreDTO;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.form.OffreForm;
import org.springframework.stereotype.Service;

@Service
public class OffreMapper implements BaseMapper<OffreDTO, OffreForm, Offre> {

    @Override
    public OffreDTO toDto(Offre entity) {
        if(entity==null)return null;
        return OffreDTO.builder()
                .titre(entity.getTitre())
                .type(entity.getType())
                .prix(entity.getPrix())
                .nbplacetotal(entity.getNbplacetotal())
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
        return entity;
    }
}
