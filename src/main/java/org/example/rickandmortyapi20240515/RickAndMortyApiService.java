package org.example.rickandmortyapi20240515;

import org.example.rickandmortyapi20240515.API.RickAndMortyApiCharacter;
import org.example.rickandmortyapi20240515.API.RickAndMortyApiResponse;
import org.example.rickandmortyapi20240515.API.RickAndMortyApiWithStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RickAndMortyApiService {

    private final RestClient restClient;

    public RickAndMortyApiService() {
        this.restClient = RestClient.builder()
                .baseUrl("https://rickandmortyapi.com")
                .build();
    }

    public RickAndMortyApiResponse loadAllCharacters(){

        RickAndMortyApiResponse body = restClient.get()
                .uri("/api/character")
                .retrieve()
                .body(RickAndMortyApiResponse.class);
        return body;
    }

    public RickAndMortyApiCharacter loadCharacterById(int id){

        RickAndMortyApiCharacter body = restClient.get()
                .uri("/api/character/{id}", id)
                .retrieve()
                .body(RickAndMortyApiCharacter.class);
        return body;

    }
    public RickAndMortyApiWithStatus loadCharactersByStatus(String status) {
        RickAndMortyApiWithStatus body = restClient.get()
                .uri("/api/character?status="+ status)
                .retrieve()
                .body(RickAndMortyApiWithStatus.class);
        return body;
    }


}
