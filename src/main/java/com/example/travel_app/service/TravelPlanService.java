package com.example.travel_app.service;

import com.example.travel_app.model.dto.TravelResponseDTO;

import javax.management.InvalidAttributeValueException;
import java.math.BigDecimal;

public interface TravelPlanService {
    TravelResponseDTO calculateTravelPlan(String countryCode,
                                          BigDecimal budgetPerCountry,
                                          BigDecimal totalBudget,
                                          String baseCurrency) throws InvalidAttributeValueException;
}
