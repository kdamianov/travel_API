package com.example.travel_app.model.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Map;

public class TravelResponseDTO {


    private String startingCountryName;
    private String baseCurrency;
    private BigDecimal totalBudget;

    private BigDecimal budgetPerCountry;
    private Map<String, BigDecimal> budgetInRespectiveCurrency;
    private int tripsCount;
    private BigDecimal neededBudget;
    private BigDecimal leftoverBudget;
    public TravelResponseDTO() {
    }

    public String getStartingCountryName() {
        return startingCountryName;
    }

    public TravelResponseDTO setStartingCountryName(String startingCountryName) {
        this.startingCountryName = startingCountryName;
        return this;
    }

    public BigDecimal getBudgetPerCountry() {
        return budgetPerCountry;
    }

    public TravelResponseDTO setBudgetPerCountry(BigDecimal budgetPerCountry) {
        this.budgetPerCountry = budgetPerCountry;
        return this;
    }

    public BigDecimal getTotalBudget() {
        return totalBudget;
    }

    public TravelResponseDTO setTotalBudget(BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
        return this;
    }

    public BigDecimal getLeftoverBudget() {
        return leftoverBudget;
    }

    public TravelResponseDTO setLeftoverBudget(BigDecimal leftoverBudget) {
        this.leftoverBudget = leftoverBudget;
        return this;
    }

    public Map<String, BigDecimal> getBudgetInRespectiveCurrency() {
        return budgetInRespectiveCurrency;
    }

    public TravelResponseDTO setBudgetInRespectiveCurrency(Map<String, BigDecimal> budgetInRespectiveCurrency) {
        this.budgetInRespectiveCurrency = budgetInRespectiveCurrency;
        return this;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public TravelResponseDTO setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    public int getTripsCount() {
        return tripsCount;
    }

    public TravelResponseDTO setTripsCount(int tripsCount) {
        this.tripsCount = tripsCount;
        return this;
    }

    public BigDecimal getNeededBudget() {
        return neededBudget;
    }

    public TravelResponseDTO setNeededBudget(BigDecimal neededBudget) {
        this.neededBudget = neededBudget;
        return this;
    }
}
