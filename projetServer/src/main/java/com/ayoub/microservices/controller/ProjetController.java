package com.ayoub.microservices.controller;

import com.ayoub.microservices.Projet;
import com.ayoub.microservices.service.ProjetService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/projets")
@AllArgsConstructor
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @GetMapping("/projet/{id}")
    public ResponseEntity<Projet> getProjet(@PathVariable Integer id_projet) {

        return new ResponseEntity<>(projetService.projetGetService(id_projet), HttpStatus.OK);
    }
    @PostMapping("/projet")
    public ResponseEntity<Projet> saveProjet(@RequestBody Projet projet) {

        return new ResponseEntity<>(projetService.projetAddService(projet), HttpStatus.OK);
    }
    @PutMapping("/projet/{id}")
    public ResponseEntity<Projet> updateProjet(@PathVariable Integer id_projet,@RequestBody Projet projet) {

        return new ResponseEntity<>(projetService.projetUpdateService(id_projet,projet), HttpStatus.OK);
    }
    @DeleteMapping("/projet/{id}")
    public ResponseEntity<String> deleteProjet(@PathVariable Integer id_projet) {

        return new ResponseEntity<>(projetService.projetDeleteService(id_projet), HttpStatus.OK);
    }
}
