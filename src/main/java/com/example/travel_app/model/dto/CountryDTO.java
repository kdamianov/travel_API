package com.example.travel_app.model.dto;

import com.example.travel_app.model.entity.Country;
import jakarta.persistence.*;

import java.util.Set;

public class CountryDTO {

    private Long id;

    private String name;

    private String countryCode;

    private Set<String> neighbors;

    public CountryDTO() {
    }

    public Long getId() {
        return id;
    }

    public CountryDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public CountryDTO setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Set<String> getNeighbors() {
        return neighbors;
    }

    public CountryDTO setNeighbors(Set<String> neighbors) {
        this.neighbors = neighbors;
        return this;
    }
}
