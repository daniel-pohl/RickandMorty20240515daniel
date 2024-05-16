package org.example.rickandmortyapi20240515;

import org.example.rickandmortyapi20240515.API.RickAndMortyApiCharacter;
import org.example.rickandmortyapi20240515.API.RickAndMortyApiResponse;
import org.example.rickandmortyapi20240515.API.RickAndMortyApiWithStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    private final RickAndMortyApiService rickAndMortyApiService;

    public CharacterController(RickAndMortyApiService rickAndMortyApiService){
        this.rickAndMortyApiService = rickAndMortyApiService;
    }

    @GetMapping
    public RickAndMortyApiResponse getAllCharacters(){
        return rickAndMortyApiService.loadAllCharacters();
    }
    @GetMapping("/{id}")
    public RickAndMortyApiCharacter getCharacterById(@PathVariable int id){
        return rickAndMortyApiService.loadCharacterById(id);
    }

    //hier könnte ich auch das in das obere Getmapping einbauen mit if else und parameter optinal einstellen
    @GetMapping("/")
    public RickAndMortyApiWithStatus loadCharactersByStatus(@RequestParam String status){
        return rickAndMortyApiService.loadCharactersByStatus(status);
    }


}
