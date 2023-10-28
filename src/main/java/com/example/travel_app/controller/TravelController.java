package com.example.travel_app.controller;

import com.example.travel_app.model.dto.CountryDTO;
import com.example.travel_app.model.dto.TravelResponseDTO;
import com.example.travel_app.service.CountryService;
import com.example.travel_app.service.TravelPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InvalidAttributeValueException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @GetMapping("/countries")
    public ResponseEntity<List<CountryDTO>> getAllCountries(){

        return ResponseEntity.ok(countryService.findAllCountries());
    }


    @GetMapping("/calculate")
    public ResponseEntity<TravelResponseDTO> calculateTravelPlan(
            @RequestParam("startingCountryName") String startingCountryCode,
            @RequestParam("budgetPerCountry") BigDecimal budgetPerCountry,
            @RequestParam("totalBudget") BigDecimal totalBudget,
            @RequestParam("baseCurrency") String baseCurrency
    ) throws InvalidAttributeValueException {
        TravelResponseDTO travelResponseDTO = travelPlanService.calculateTravelPlan(
                startingCountryCode, budgetPerCountry, totalBudget, baseCurrency);
        return ResponseEntity.ok(travelResponseDTO);
    }

    //http://localhost:8080/api/travel/calculate?startingCountryName=Bulgaria&budgetPerCountry=100&totalBudget=1200&baseCurrency=EUR


}
