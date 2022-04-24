package com.mobdev.rickandmorty.services;

import com.mobdev.rickandmorty.exceptions.BadRequestException;
import com.mobdev.rickandmorty.models.Character;
import com.mobdev.rickandmorty.models.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CharacterService {

    final RestTemplate restTemplate;

    public CharacterService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Character getSingleCharacter(int id) {

        String url = "https://rickandmortyapi.com/api/character/" + id;
        ResponseEntity<Character> response = restTemplate.getForEntity(url, Character.class);
        Character character = response.getBody();
        return character;

    }

    public Location getSinglelocation(String url) {
        ResponseEntity<Location> response = restTemplate.getForEntity(url, Location.class);
        Location location = response.getBody();
        return location;

    }


}
