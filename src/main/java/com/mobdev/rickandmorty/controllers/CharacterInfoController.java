package com.mobdev.rickandmorty.controllers;

import com.mobdev.rickandmorty.DTO.CharacterContractDTO;
import com.mobdev.rickandmorty.DTO.OriginDTO;
import com.mobdev.rickandmorty.models.Character;
import com.mobdev.rickandmorty.models.Location;
import com.mobdev.rickandmorty.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterInfoController {

    @Autowired
    CharacterService characterService;


    @GetMapping("/character/{id}")
    public ResponseEntity<CharacterContractDTO> getCharacterInfo(@PathVariable int id) {

        Character character = characterService.getSingleCharacter(id);
        OriginDTO originDTO = new OriginDTO();

        if (character.getOrigin().getUrl().equals("")) {
            originDTO = new OriginDTO(character.getOrigin());
        } else {
            Location location = characterService.getSinglelocation(character.getOrigin().getUrl());
            originDTO = new OriginDTO(location, character.getOrigin());

        }
        CharacterContractDTO characterContractDTO = new CharacterContractDTO(character, originDTO);
        return new ResponseEntity<CharacterContractDTO>(characterContractDTO, HttpStatus.ACCEPTED);


    }
}
