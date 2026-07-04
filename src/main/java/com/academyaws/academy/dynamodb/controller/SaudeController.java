package com.academyaws.academy.dynamodb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SaudeController {

    @GetMapping("saudeApp")
    public ResponseEntity<Map<String, String>> verificaSaudeApp() {

        Date dataHoraAtual = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formatador.format(dataHoraAtual);

        System.out.println("Hora atual eh: " + horaFormatada + " show");

        Map<String, String> response = new HashMap<>();
        response.put("status", "Running");
        response.put("hora", horaFormatada);

        return ResponseEntity.ok(response);
    }
}
