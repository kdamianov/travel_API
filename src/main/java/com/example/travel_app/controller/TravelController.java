package com.example.travel_app.controller;

import com.example.travel_app.model.dto.CountryResponseDTO;
import com.example.travel_app.model.dto.TravelResponseDTO;
import com.example.travel_app.service.CountryService;
import com.example.travel_app.service.TravelPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InvalidAttributeValueException;
import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping("/api/travel")
public class TravelController {

    private final CountryService countryService;
    private final TravelPlanService travelPlanService;

    public TravelController(CountryService countryService,
                            TravelPlanService travelPlanService) {
        this.countryService = countryService;
        this.travelPlanService = travelPlanService;
    }

    //return all the neighbors of the country
    @GetMapping("/countries")
    public ResponseEntity<List<CountryResponseDTO>> getAllCountries(){

        return ResponseEntity.ok(countryService.findAllCountries());
    }

    //return the travelPlan result
    @GetMapping("/calculate")
    public ResponseEntity<TravelResponseDTO> calculateTravelPlan(
            @RequestParam("startingCountryName") String startingCountryName,
            @RequestParam("budgetPerCountry") BigDecimal budgetPerCountry,
            @RequestParam("totalBudget") BigDecimal totalBudget,
            @RequestParam("baseCurrency") String baseCurrency
    ) throws InvalidAttributeValueException {
        TravelResponseDTO travelResponseDTO = travelPlanService.calculateTravelPlan(
                startingCountryName, budgetPerCountry, totalBudget, baseCurrency);
        return ResponseEntity.ok(travelResponseDTO);
    }

    //Test:
    //http://localhost:8080/api/travel/calculate?startingCountryName=Bulgaria&budgetPerCountry=100&totalBudget=1200&baseCurrency=EUR


}
