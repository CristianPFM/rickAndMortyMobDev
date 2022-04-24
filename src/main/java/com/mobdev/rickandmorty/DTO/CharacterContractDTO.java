package com.mobdev.rickandmorty.DTO;

import com.mobdev.rickandmorty.models.Character;
import lombok.Data;

@Data
public class CharacterContractDTO {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_count;
    private OriginDTO origin;

    public CharacterContractDTO(Character character, OriginDTO originDTO) {
        this.id = character.getId();
        this.name = character.getName();
        this.status = character.getStatus();
        this.species = character.getSpecies();
        this.type = character.getType();
        this.episode_count = character.getEpisode().size();
        this.origin = originDTO;
    }
}
