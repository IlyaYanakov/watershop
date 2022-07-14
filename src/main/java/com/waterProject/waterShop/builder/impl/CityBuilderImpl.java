package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.CityBuilder;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.Country;
import com.waterProject.waterShop.dto.request.CreateCityDto;
import com.waterProject.waterShop.dto.response.CityDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor

public class CityBuilderImpl implements CityBuilder {


    @Override
    public CityDto build(City city) {
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .country(city.getCountry())
                .build();
    }

    @Override
    public City build(CreateCityDto request,
                      Country country) {
        City city = new City();
        city.setName(request.getName());
        city.setCountry(country);
        city.setCreatedAt(new Date());
        return city;
    }

    @Override
    public void update(City city,
                       CreateCityDto request,
                       Country country) {
        city.setName(request.getName());
        city.setCountry(country);
        city.setUpdatedAt(new Date());
    }
}
