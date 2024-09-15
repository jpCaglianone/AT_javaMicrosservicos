package com.example.at_javamicrosservicos_questao7;

import org.springframework.boot.SpringApplication;

public class TestAtJavaMicrosservicosQuestao7Application {

    public static void main(String[] args) {
        SpringApplication.from(AtJavaMicrosservicosQuestao7Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
