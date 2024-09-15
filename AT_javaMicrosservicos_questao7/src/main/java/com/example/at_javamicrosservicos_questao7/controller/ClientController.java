package com.example.at_javamicrosservicos_questao7.controller;

import com.example.at_javamicrosservicos_questao7.service.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cep")
public class ClientController {

    @Autowired
    private ApiClient apiClient;

    @PostMapping()
    public Mono<String> buscarCep(@RequestBody String cep) {
        return apiClient.getDataFromApi(cep);
    }
}
