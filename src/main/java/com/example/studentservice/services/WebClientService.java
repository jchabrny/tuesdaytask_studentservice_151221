package com.example.studentservice.services;

import com.example.studentservice.model.Character;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


public class WebClientService {

    public static void getInfos(int characterNumber){

    WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    Character test1String = webClient.get()
    .uri("/character/" + characterNumber)
    .retrieve()
    .bodyToMono(Character.class).block();
     System.out.println(test1String);

       /* JsonNode test2String = webClient.get()
                .uri("/location")
                .retrieve()
                .bodyToMono(JsonNode.class).block();
        System.out.println(test2String); */
    }
}

