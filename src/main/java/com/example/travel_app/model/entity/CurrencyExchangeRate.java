package com.example.travel_app.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "currency_exchange_rate")
public class CurrencyExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //we take as a base EUR
    @Column(name = "source_currency")
    private String sourceCurrency;

    //the country currency
    @Column(name = "target_currency")
    private String targetCurrency;
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    @OneToOne
    private Country country;

    public CurrencyExchangeRate() {

    }

    public Long getId() {
        return id;
    }

    public CurrencyExchangeRate setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public CurrencyExchangeRate setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
        return this;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public CurrencyExchangeRate setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
        return this;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public CurrencyExchangeRate setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public CurrencyExchangeRate setCountry(Country country) {
        this.country = country;
        return this;
    }
}
