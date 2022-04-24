package com.mobdev.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Origin {
    private String name;
    private String url;
}
