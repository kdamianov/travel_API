package com.example.travel_app.service.impl;

import com.example.travel_app.model.dto.CountryResponseDTO;
import com.example.travel_app.model.entity.Country;
import com.example.travel_app.repository.CountryRepository;
import com.example.travel_app.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    //find all the countries with their neighbors
    @Override
    public List<CountryResponseDTO> findAllCountries() {

        return this.countryRepository.findAll()
                .stream()
                .map(CountryServiceImpl::mapToCountryDTO)
                .toList();
    }

    //map the result to a DTO class
    private static CountryResponseDTO mapToCountryDTO(Country country) {
        Set<String> neighbors = country.getNeighbors()
                .stream()
                .map(Country::getName)
                .collect(Collectors.toSet());

        return new CountryResponseDTO().setId(country.getId())
                .setName(country.getName())
                .setCountryCode(country.getCountryCode())
                .setNeighbors(neighbors);
    }
}
