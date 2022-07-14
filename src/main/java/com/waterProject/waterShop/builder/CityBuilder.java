package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.Country;
import com.waterProject.waterShop.dto.request.CreateAddressDto;
import com.waterProject.waterShop.dto.request.CreateCityDto;
import com.waterProject.waterShop.dto.response.CityDto;

public interface CityBuilder {

    CityDto build(City city);

    City build(CreateCityDto request, Country country);

    void update(City city, CreateCityDto request, Country country);
}
