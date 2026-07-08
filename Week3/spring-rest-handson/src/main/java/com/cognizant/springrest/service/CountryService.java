package com.cognizant.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.springrest.model.Country;

@Service
public class CountryService {

    private final List<Country> countries = new ArrayList<>();

    public CountryService() {
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public Country getCountryByCode(String code) {
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public Country addCountry(Country country) {
        countries.add(country);
        return country;
    }

    public Country updateCountry(String code, Country updatedCountry) {
        Country country = getCountryByCode(code);

        if (country != null) {
            country.setName(updatedCountry.getName());
        }

        return country;
    }

    public boolean deleteCountry(String code) {
        return countries.removeIf(country ->
                country.getCode().equalsIgnoreCase(code));
    }
}