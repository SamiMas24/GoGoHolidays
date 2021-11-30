package com.example.gogoholidays.services;

import com.example.gogoholidays.mapper.TransportMapper;
import com.example.gogoholidays.models.dto.TransportDTO;
import com.example.gogoholidays.models.entity.Transport;
import com.example.gogoholidays.models.form.TransportForm;
import com.example.gogoholidays.repository.TransportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransportService implements BaseService<TransportDTO, TransportForm, Transport> {
    private final TransportMapper mapper;
    private final TransportRepository repository;

    public TransportService(TransportMapper mapper, TransportRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<TransportDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TransportDTO add(Transport toAdd) {
        return null;
    }

    @Override
    public TransportDTO remove(TransportForm transportForm) {
        return null;
    }

    @Override
    public TransportDTO uptate(TransportForm transportForm) {
        return null;
    }

    @Override
    public TransportDTO findOne(TransportForm transportForm) {
        return null;
    }
}
