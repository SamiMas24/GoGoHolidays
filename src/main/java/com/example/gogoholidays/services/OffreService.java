package com.example.gogoholidays.services;

import com.example.gogoholidays.mapper.DestinationMapper;
import com.example.gogoholidays.mapper.OffreMapper;
import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.dto.OffreDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.form.OffreForm;
import com.example.gogoholidays.repository.DestinationRepository;
import com.example.gogoholidays.repository.OffreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OffreService implements BaseService<OffreDTO,Integer,OffreForm> {
    private final OffreMapper mapper;
    private final OffreRepository repository;
    private final DestinationMapper mapperDest;
    private final DestinationRepository destinationRep;
    public OffreService(OffreMapper mapper, OffreRepository repository, DestinationMapper mapperDest, DestinationRepository destinationRep) {
        this.mapper = mapper;
        this.repository = repository;
        this.mapperDest = mapperDest;
        this.destinationRep = destinationRep;
    }

    @Override
    public List<OffreDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
    public List<SmalDestinationDTO> getAllDestination(Integer id) {
        return destinationRep.getByOffre(id)
                .stream()
                .map(mapperDest::toSmallDto)
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
