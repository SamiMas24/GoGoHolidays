package com.example.gogoholidays.controller;

import com.example.gogoholidays.models.dto.TrajetDTO;
import com.example.gogoholidays.services.TrajetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trajet")
public class TrajetController {
    private final TrajetService service;

    public TrajetController(TrajetService service) {
        this.service = service;
    }

    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<TrajetDTO>> getAll(){
        return ResponseEntity
                .ok(service.getAll());
    }
    @GetMapping(path = {"/allByOffre"},params = {"id"})
    public ResponseEntity<List<TrajetDTO>> getAllByOffre(@RequestParam int id){
        return ResponseEntity
                .ok(service.getAllByOffre(id));
    }
}
