package com.mobdev.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private Origin origin;
    private List<String> episode;

}