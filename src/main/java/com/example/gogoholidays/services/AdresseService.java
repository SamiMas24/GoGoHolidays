package com.example.gogoholidays.services;

import com.example.gogoholidays.mapper.AdresseMapper;
import com.example.gogoholidays.models.dto.AdresseDTO;
import com.example.gogoholidays.models.entity.Adresse;
import com.example.gogoholidays.models.form.AdresseForm;
import com.example.gogoholidays.repository.AdresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class AdresseService implements BaseService<AdresseDTO, AdresseForm, Adresse> {
    private final AdresseMapper mapper;
    private final AdresseRepository repository;

    public AdresseService(AdresseMapper mapper, AdresseRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<AdresseDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public AdresseDTO add(Adresse toAdd) {
        return null;
    }

    @Override
    public AdresseDTO remove(AdresseForm adresseForm) {
        return null;
    }

    @Override
    public AdresseDTO uptate(AdresseForm adresseForm) {
        return null;
    }

    @Override
    public AdresseDTO findOne(AdresseForm adresseForm) {
        return null;
    }
}
