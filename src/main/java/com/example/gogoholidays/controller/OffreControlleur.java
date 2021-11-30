package com.example.gogoholidays.controller;

import com.example.gogoholidays.models.dto.DestinationDTO;
import com.example.gogoholidays.models.dto.OffreDTO;
import com.example.gogoholidays.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.gogoholidays.models.form.OffreForm;
import com.example.gogoholidays.services.OffreService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/offre")
public class OffreControlleur {
    private final OffreService service;

    public OffreControlleur(OffreService service) {
        this.service = service;
    }
    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<OffreDTO>> getAll(){
        return ResponseEntity
                .ok(service.getAll());
    }
    @PostMapping(path = {"", "/", "/add"})
    public OffreDTO insert(@Valid @RequestBody OffreForm form, @RequestHeader HttpHeaders headers){
        for (String key : headers.keySet()) {
            System.out.println( headers.get(key) );
        }
        return service.add(form);

    }

    @GetMapping(path = {"","/","/allDestination"},params = {"id"})
    public ResponseEntity<List<SmalDestinationDTO>> getAllDestination(@RequestParam int id){
        return ResponseEntity
                .ok(service.getAllDestination(id));
    }
}
