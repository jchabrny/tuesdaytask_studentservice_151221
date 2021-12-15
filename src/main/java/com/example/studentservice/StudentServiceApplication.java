package com.example.studentservice;

import com.example.studentservice.model.Character;
import com.example.studentservice.services.WebClientService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class StudentServiceApplication {



    public static void main(String[] args) {
       // SpringApplication.run(StudentServiceApplication.class, args);

    WebClientService.getInfos(4);
    }
}
