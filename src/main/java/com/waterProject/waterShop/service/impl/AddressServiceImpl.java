package com.waterProject.waterShop.service.impl;

import com.waterProject.waterShop.builder.AddressBuilder;
import com.waterProject.waterShop.domain.Address;
import com.waterProject.waterShop.dto.request.CreateAddressDto;
import com.waterProject.waterShop.dto.response.AddressDto;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.Country;
import com.waterProject.waterShop.dto.request.CreateCityDto;
import com.waterProject.waterShop.dto.response.CityDto;
import com.waterProject.waterShop.repository.AddressRepository;
import com.waterProject.waterShop.service.AddressService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    AddressRepository addressRepository;
    AddressBuilder addressBuilder;

}
