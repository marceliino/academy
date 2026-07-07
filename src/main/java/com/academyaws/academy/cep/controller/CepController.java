package com.academyaws.academy.cep.controller;

import com.academyaws.academy.cep.entity.Cep;
import com.academyaws.academy.cep.repository.CepRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ceps")
public class CepController {

    private final CepRepository repository;

    public CepController(CepRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Cep>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }
}