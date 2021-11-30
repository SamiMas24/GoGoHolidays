package com.example.gogoholidays.controller;

import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.services.DestinationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/destination")
public class DestinationControlleur {
    private final DestinationService service;

    public DestinationControlleur(DestinationService service) {
        this.service = service;
    }

    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<DestinationDTO>> getAll(){
        return ResponseEntity
                .ok(service.getAll());
    }
}
