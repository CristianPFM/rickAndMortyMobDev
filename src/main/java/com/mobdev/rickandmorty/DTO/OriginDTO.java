package com.mobdev.rickandmorty.DTO;

import com.mobdev.rickandmorty.models.Location;
import com.mobdev.rickandmorty.models.Origin;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class OriginDTO {
    private String name;
    private String url;
    private String dimension;
    private List<String> residents;

    public OriginDTO(Location location, Origin origin) {
        this.name = origin.getName();
        this.url = origin.getUrl();
        this.dimension = location.getDimension();
        this.residents = location.getResidents();

    }

    public OriginDTO(Origin origin) {
        this.name = origin.getName();
        this.url = origin.getUrl();
        this.dimension = "";
        this.residents = new ArrayList<>();


    }
}
