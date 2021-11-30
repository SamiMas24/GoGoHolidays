package com.example.gogoholidays.services;

import com.example.gogoholidays.mapper.DestinationMapper;
import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.entity.Destination;
import com.example.gogoholidays.models.form.DestinationForm;
import com.example.gogoholidays.repository.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DestinationService implements BaseService<DestinationDTO, DestinationForm, Destination> {
    private final DestinationMapper mapper;
    private final DestinationRepository repository;

    public DestinationService(DestinationMapper mapper, DestinationRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<DestinationDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DestinationDTO add(Destination toAdd) {
        return null;
    }

    @Override
    public DestinationDTO remove(DestinationForm destinationForm) {
        return null;
    }

    @Override
    public DestinationDTO uptate(DestinationForm destinationForm) {
        return null;
    }

    @Override
    public DestinationDTO findOne(DestinationForm destinationForm) {
        return null;
    }
}
