package com.example.travel_app.service;


import com.example.travel_app.model.dto.CountryResponseDTO;

import java.util.List;

public interface CountryService {
    List<CountryResponseDTO> findAllCountries();
}
