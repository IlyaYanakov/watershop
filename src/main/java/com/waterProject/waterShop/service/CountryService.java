package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateCountryDto;
import com.waterProject.waterShop.dto.response.CountryDto;

import java.util.List;

public interface CountryService {
    void create(CreateCountryDto request);

    List<CountryDto> getAll();

    CountryDto getById(Long id);

    void update(Long id, CreateCountryDto request);

    void deleteById(Long id);
}
