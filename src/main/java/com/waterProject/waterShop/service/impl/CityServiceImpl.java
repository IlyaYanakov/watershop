package com.waterProject.waterShop.service.impl;

import com.waterProject.waterShop.builder.CityBuilder;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.Country;
import com.waterProject.waterShop.dto.request.CreateCityDto;
import com.waterProject.waterShop.dto.response.CityDto;
import com.waterProject.waterShop.repository.CityRepository;
import com.waterProject.waterShop.repository.CountryRepository;
import com.waterProject.waterShop.service.CityService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    CityRepository cityRepository;
    CityBuilder cityBuilder;
    CountryRepository countryRepository;

    @Override
    public void create(CreateCityDto request) {
        Optional<Country> countryOpt = countryRepository.findById(request.getCountryId());
        if (countryOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        City city = cityBuilder.build(request, countryOpt.get());
        cityRepository.save(city);
    }

    @Override
    public List<CityDto> getAll() {
        List<City> cityList = cityRepository.findAll();
        List<CityDto> cityDtoList = new ArrayList<>();
        for (City item : cityList) {
            cityDtoList.add(cityBuilder.build(item));
        }
        return cityDtoList;
    }

    @Override
    public CityDto getById(Long id) {
        Optional<City> cityOpt = cityRepository.findById(id);
        if (cityOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return cityBuilder.build(cityOpt.get());
    }

    @Override
    public void update(Long id, CreateCityDto request) {
        Optional<City> cityOpt = cityRepository.findById(id);
        if (cityOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        Optional<Country> countryOpt = countryRepository.findById(id);
        if (countryOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        City updateCity = cityOpt.get();
        cityBuilder.update(updateCity, request, countryOpt.get());
    }

    @Override
    public void deleteById(Long id) {
        Optional<City> cityOpt = cityRepository.findById(id);
        if (cityOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        cityRepository.deleteById(id);
    }
}
