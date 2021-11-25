package com.example.gogoholidays.services;

import com.example.gogoholidays.mapper.OffreMapper;
import com.example.gogoholidays.models.dto.OffreDTO;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.form.OffreForm;
import com.example.gogoholidays.repository.OffreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OffreService implements BaseService<OffreDTO,Integer,OffreForm> {
    private final OffreMapper mapper;
    private final OffreRepository repository;

    public OffreService(OffreMapper mapper, OffreRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<OffreDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OffreDTO add(OffreForm toAdd) {
        Offre offre= mapper.formToEntity(toAdd);
        return mapper.toDto(offre);
    }

    @Override
    public OffreDTO remove(Integer integer) {
        return null;
    }

    @Override
    public OffreDTO uptate(Integer integer) {
        return null;
    }

    @Override
    public OffreDTO findOne(Integer integer) {
        return null;
    }
}
