package com.example.travel_app.model.dto;

import java.util.Set;

public class CountryResponseDTO {

    private Long id;

    private String name;

    private String countryCode;

    private Set<String> neighbors;

    public CountryResponseDTO() {
    }

    public Long getId() {
        return id;
    }

    public CountryResponseDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryResponseDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public CountryResponseDTO setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Set<String> getNeighbors() {
        return neighbors;
    }

    public CountryResponseDTO setNeighbors(Set<String> neighbors) {
        this.neighbors = neighbors;
        return this;
    }
}
