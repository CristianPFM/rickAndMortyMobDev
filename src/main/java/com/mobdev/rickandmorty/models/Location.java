package com.mobdev.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String dimension;
    private List<String> residents;
}
