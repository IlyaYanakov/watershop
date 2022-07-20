package com.waterProject.waterShop.service.impl;

import com.waterProject.waterShop.builder.AddressBuilder;
import com.waterProject.waterShop.domain.Address;
<<<<<<< HEAD
import com.waterProject.waterShop.dto.request.CreateAddressDto;
import com.waterProject.waterShop.dto.response.AddressDto;
=======
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.Country;
import com.waterProject.waterShop.dto.request.CreateCityDto;
import com.waterProject.waterShop.dto.response.CityDto;
import com.waterProject.waterShop.repository.AddressRepository;
>>>>>>> day--19-07-22-Ilya
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

<<<<<<< HEAD
    @Override
    public List<Address> viewAllAddress() {
        return null;
    }

    @Override
    public AddressDto getById(Long id) {
        return null;
    }

    @Override
    public void deleteAddress(Long id) {

    }

    @Override
    public void update(Long id, CreateAddressDto request) {

    }
=======
    AddressRepository addressRepository;
    AddressBuilder addressBuilder;
>>>>>>> day--19-07-22-Ilya
}
