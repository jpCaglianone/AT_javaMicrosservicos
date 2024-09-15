package com.example.at_javamicrosservicos_questao1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questao1")
public class WorkingController {

    @GetMapping
    public String home() {
        return "Funcionando!";
    }
}
