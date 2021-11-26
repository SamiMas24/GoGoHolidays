package com.example.gogoholidays.mapper;

import com.example.gogoholidays.models.dto.AdresseDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalAdresseDTO;
import com.example.gogoholidays.models.entity.Adresse;
import com.example.gogoholidays.models.form.AdresseForm;
import org.springframework.stereotype.Service;

@Service
public class AdresseMapper implements BaseMapper<AdresseDTO, AdresseForm, Adresse> {
    @Override
    public AdresseDTO toDto(Adresse entity) {
        return null;
    }
    public SmalAdresseDTO toDtoSmall(Adresse entity) {
        if(entity==null)return null;
        return SmalAdresseDTO.builder()
                .id(entity.getId())
                .pays(entity.getPays())
                .ville(entity.getVille())
                .rue(entity.getRue())
                .numero(entity.getNumero())
                .build();
    }
    @Override
    public Adresse formToEntity(AdresseForm form) {
        return null;
    }
}
