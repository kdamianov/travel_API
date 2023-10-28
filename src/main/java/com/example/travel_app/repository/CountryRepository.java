package com.example.travel_app.repository;

import com.example.travel_app.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    //Find a specific country by its name
    Optional<Country> findCountryByName(String name);
}
