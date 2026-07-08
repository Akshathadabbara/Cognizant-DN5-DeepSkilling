package com.cognizant.springrest.controller;

import com.cognizant.springrest.dto.CountryDTO;
import com.cognizant.springrest.model.Country;
import com.cognizant.springrest.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    // GET All Countries
    @GetMapping
    public List<CountryDTO> getAllCountries() {

        return service.getAllCountries()
                .stream()
                .map(country -> new CountryDTO(
                        country.getCode(),
                        country.getName()))
                .collect(Collectors.toList());
    }

    // GET Country by Code
    @GetMapping("/{code}")
    public ResponseEntity<CountryDTO> getCountry(@PathVariable String code) {

        Country country = service.getCountryByCode(code);

        if (country == null) {
            return ResponseEntity.notFound().build();
        }

        CountryDTO dto = new CountryDTO(
                country.getCode(),
                country.getName());

        return ResponseEntity.ok(dto);
    }

    // POST Country
    @PostMapping
    public Country addCountry(@Valid @RequestBody Country country) {
        return service.addCountry(country);
    }

    // PUT Country
    @PutMapping("/{code}")
    public ResponseEntity<Country> updateCountry(
            @PathVariable String code,
            @Valid @RequestBody Country country) {

        Country updated = service.updateCountry(code, country);

        if (updated == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updated);
    }

    // DELETE Country
    @DeleteMapping("/{code}")
    public ResponseEntity<String> deleteCountry(@PathVariable String code) {

        boolean deleted = service.deleteCountry(code);

        if (deleted) {
            return ResponseEntity.ok("Country Deleted Successfully");
        }

        return ResponseEntity.notFound().build();
    }
}