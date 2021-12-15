package com.example.studentservice;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class StudentServiceApplication {



    public static void main(String[] args) {
       // SpringApplication.run(StudentServiceApplication.class, args);
        JsonNode testString = WebClient.create("https://rickandmortyapi.com").get()
                .uri("/api/character/1")
                .retrieve()
                .bodyToMono(JsonNode.class).block();
        System.out.println(testString);
    }
}
