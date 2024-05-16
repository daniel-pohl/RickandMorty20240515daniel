package org.example.rickandmortyapi20240515.API;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record RickAndMortyApiResponse(
        //das heisst eig info aber wir nennen es infos
        @JsonAlias("info")
        RickAndMortyApiInfo infos,
        List<RickAndMortyApiCharacter> results
) {
}
