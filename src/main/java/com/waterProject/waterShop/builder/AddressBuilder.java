package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Address;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateAddressDto;
import com.waterProject.waterShop.dto.response.AddressDto;

public interface AddressBuilder {
    AddressDto build(Address address);

    Address build(CreateAddressDto request, User user, City city);

    void update(Address address, CreateAddressDto request, User user, City city);
}
