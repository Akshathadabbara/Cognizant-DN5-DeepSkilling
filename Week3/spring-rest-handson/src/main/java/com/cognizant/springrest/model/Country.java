package com.cognizant.springrest.model;

import jakarta.validation.constraints.NotBlank;

public class Country {

    @NotBlank(message = "Country code is required")
    private String code;

    @NotBlank(message = "Country name is required")
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}