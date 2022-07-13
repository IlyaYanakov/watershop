package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateCityDto;
import com.waterProject.waterShop.dto.response.CityDto;

import java.util.List;

public interface CityService {
    void create(CreateCityDto request);

    List<CityDto> getAll();

    CityDto getById(Long id);

    void update(Long id, CreateCityDto request);

    void deleteById(Long id);
}
