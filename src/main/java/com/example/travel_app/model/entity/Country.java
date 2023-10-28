package com.example.travel_app.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column(name = "country_code")
    private String countryCode;

    @OneToOne
    private CurrencyExchangeRate currencyExchangeRate;

    @ManyToMany
    @JoinTable(
            name = "country_neighbors",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "neighbor_id")
    )
    private Set<Country> neighbors;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public Country setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Country setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Set<Country> getNeighbors() {
        return neighbors;
    }

    public Country setNeighbors(Set<Country> neighbors) {
        this.neighbors = neighbors;
        return this;
    }

    public CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    public Country setCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
        return this;
    }
}
