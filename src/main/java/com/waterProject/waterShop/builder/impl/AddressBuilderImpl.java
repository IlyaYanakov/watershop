package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.AddressBuilder;
import com.waterProject.waterShop.builder.CityBuilder;
import com.waterProject.waterShop.domain.Address;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateAddressDto;
import com.waterProject.waterShop.dto.response.AddressDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springdoc.core.AbstractRequestService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class AddressBuilderImpl implements AddressBuilder {
    @Override
    public AddressDto build(Address address) {
        CityBuilder cityBuilder = null;

        return AddressDto.builder()
                .id(address.getId())
                .latitude(address.getLatitude())
                .longitude(address.getLongitude())
                .city(cityBuilder.build(address.getCity()))
                .street(address.getStreet())
                .house(address.getHouse())
                .level(address.getLevel())
                .elevator(address.getWithLift())
                .floor(address.getFloor())
                .user(address.getUser())
                .build();



    }

    @Override
    public Address build(CreateAddressDto request,
                         User user,
                         City city) {
        Address address = new Address();
        address.setLatitude(request.getLatitude());
        address.setLongitude(request.getLongitude());
        address.setCity(city);
        address.setStreet(request.getStreet());
        address.setHouse(request.getHouse());
        address.setLevel(request.getLevel());
        address.setWithLift(request.isElevator());
        address.setFloor(request.getFloor());
        address.setUser(request.getUser());
        address.setUpdatedAt(new Date());
        return address;

    }

    @Override
    public void update(Address address,
                       CreateAddressDto request,
                       User user,
                       City city) {
        address.setLatitude(request.getLatitude());
        address.setLongitude(request.getLongitude());
        address.setCity(city);
        address.setStreet(request.getStreet());
        address.setHouse(request.getHouse());
        address.setFloor(request.getFloor());
        address.setLevel(request.getLevel());
        address.setWithLift(request.isElevator());
        address.setUser(user);
        address.setUpdatedAt(new Date());
    }
}
