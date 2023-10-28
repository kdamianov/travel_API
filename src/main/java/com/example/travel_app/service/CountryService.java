package com.example.travel_app.service;


import com.example.travel_app.model.dto.CountryDTO;

import java.util.List;

public interface CountryService {
    List<CountryDTO> findAllCountries();
}
