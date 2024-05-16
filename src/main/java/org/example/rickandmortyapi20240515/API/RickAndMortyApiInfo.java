package org.example.rickandmortyapi20240515.API;

public record RickAndMortyApiInfo(
        int count,
        int pages,
        String next,
        String prev
) {
}
