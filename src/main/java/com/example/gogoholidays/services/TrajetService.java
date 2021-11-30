package com.example.gogoholidays.services;

import com.example.gogoholidays.mapper.TrajetMapper;
import com.example.gogoholidays.models.dto.TrajetDTO;
import com.example.gogoholidays.models.entity.Trajet;
import com.example.gogoholidays.models.form.TrajetForm;
import com.example.gogoholidays.repository.TrajetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class TrajetService implements BaseService<TrajetDTO, TrajetForm, Trajet>{
    private final TrajetRepository trajetRepository;
    private final TrajetMapper trajetMapper;
    public TrajetService(TrajetRepository trajetRepository, TrajetMapper trajetMapper) {
        this.trajetRepository = trajetRepository;
        this.trajetMapper = trajetMapper;
    }

    @Override
    public List<TrajetDTO> getAll() {
        return trajetRepository.findAll()
                .stream()
                .map(trajetMapper::toDto)
                .collect(Collectors.toList());
    }
    public List<TrajetDTO> getAllByOffre(int id) {
        return trajetRepository.findAllByOffre(id)
                .stream()
                .map(trajetMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public TrajetDTO add(Trajet toAdd) {
        return null;
    }

    @Override
    public TrajetDTO remove(TrajetForm trajetForm) {
        return null;
    }

    @Override
    public TrajetDTO uptate(TrajetForm trajetForm) {
        return null;
    }

    @Override
    public TrajetDTO findOne(TrajetForm trajetForm) {
        return null;
    }
}
