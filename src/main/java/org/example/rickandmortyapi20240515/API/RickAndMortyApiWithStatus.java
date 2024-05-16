
package org.example.rickandmortyapi20240515.API;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record RickAndMortyApiWithStatus(

        List<RickAndMortyApiCharacter> results
) {
}
