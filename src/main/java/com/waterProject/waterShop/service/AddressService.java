package com.waterProject.waterShop.service;

import com.waterProject.waterShop.domain.Address;
import com.waterProject.waterShop.dto.request.CreateAddressDto;
import com.waterProject.waterShop.dto.response.AddressDto;
import com.waterProject.waterShop.dto.response.CountryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    Address add (CreateAddressDto request);

    List<Address> viewAllAddress();

    AddressDto getById(Long id);

    void deleteAddress (Long id);

    void update(Long id, CreateAddressDto request);

}
