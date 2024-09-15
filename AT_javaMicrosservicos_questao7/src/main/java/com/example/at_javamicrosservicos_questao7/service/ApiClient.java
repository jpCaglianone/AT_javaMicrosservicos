package com.example.at_javamicrosservicos_questao7.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiClient {

    private final WebClient webClient;

    public ApiClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://viacep.com.br/ws").build();
    }

    public Mono<String> getDataFromApi(String cep) {

        String cleanedCep = cep.replaceAll("\"", "").trim();

        return webClient.get()
                .uri("/{cep}/json/", cleanedCep)
                .retrieve()
                .bodyToMono(String.class)
                .map(this::processData);
    }

    private String processData(String data) {
        return "Processed: " + data;
    }
}
