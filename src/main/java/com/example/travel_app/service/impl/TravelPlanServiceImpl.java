package com.example.travel_app.service.impl;

import com.example.travel_app.model.dto.TravelResponseDTO;
import com.example.travel_app.model.entity.Country;
import com.example.travel_app.repository.CountryRepository;
import com.example.travel_app.service.TravelPlanService;
import org.springframework.stereotype.Service;

import javax.management.InvalidAttributeValueException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class TravelPlanServiceImpl implements TravelPlanService {

    private final CountryRepository countryRepository;

    public TravelPlanServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public TravelResponseDTO calculateTravelPlan(String countryName,
                                                 BigDecimal budgetPerCountry,
                                                 BigDecimal totalBudget,
                                                 String baseCurrency) throws InvalidAttributeValueException {

        //find starting country
        Country startCountry = countryRepository.findCountryByName(countryName).orElse(null);

        if (startCountry == null) {
            throw new InvalidAttributeValueException("Country not found!");
        }

        //find country neighbors
        Set<Country> countryNeighbors = startCountry.getNeighbors();

        //find trips count
        int tripsCount = totalBudget.divide(budgetPerCountry, RoundingMode.DOWN).intValue();

        //calculate budget per country in respective currency
        Map<String, BigDecimal> budgetsInRespectiveCurrencies = new HashMap<>();
        BigDecimal leftoverBudget = totalBudget;

        for (Country country : countryNeighbors) {
            BigDecimal budgetInLocalCurrency = calculateBudgetInCountryCurrency(budgetPerCountry, country, baseCurrency);
            budgetsInRespectiveCurrencies.put(country.getName(), budgetInLocalCurrency);
            leftoverBudget = leftoverBudget.subtract(budgetInLocalCurrency);
        }

        // Create and return the response
        TravelResponseDTO travelResponseDTO = new TravelResponseDTO();
        travelResponseDTO.setTripsCount(tripsCount);
        travelResponseDTO.setBudgetInRespectiveCurrency(budgetsInRespectiveCurrencies);
        travelResponseDTO.setLeftoverBudget(leftoverBudget);


        return travelResponseDTO;
    }



    private BigDecimal calculateBudgetInCountryCurrency(BigDecimal budgetPerCountry, Country country, String inputCurrency) throws InvalidAttributeValueException {
        BigDecimal exchangeRate = country.getCurrencyExchangeRate().getExchangeRate();

        if (exchangeRate == null) {
            // Missing exchange rate
            throw new InvalidAttributeValueException("Exchange rate not found for " + country.getName());
        }

        BigDecimal budgetInCountryCurrency = budgetPerCountry.divide(exchangeRate, 2, RoundingMode.HALF_UP);


        return budgetInCountryCurrency;
    }
}
