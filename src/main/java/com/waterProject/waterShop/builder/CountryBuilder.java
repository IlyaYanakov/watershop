package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Country;
import com.waterProject.waterShop.dto.request.CreateCountryDto;
import com.waterProject.waterShop.dto.response.CountryDto;

public interface CountryBuilder {
    CountryDto build(Country country);

    Country build(CreateCountryDto request);

    void update(Country country, CreateCountryDto request);
}
