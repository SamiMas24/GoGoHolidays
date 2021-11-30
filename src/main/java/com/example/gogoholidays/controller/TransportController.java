package com.example.gogoholidays.controller;

import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.dto.TransportDTO;
import com.example.gogoholidays.services.TransportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transport")
public class TransportController {
    private final TransportService service;
    public TransportController(TransportService service) {
        this.service = service;
    }

    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<TransportDTO>> getAll(){
        return ResponseEntity
                .ok(service.getAll());
    }
}
