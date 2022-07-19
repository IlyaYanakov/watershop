package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Seller;
import com.waterProject.waterShop.domain.SellerUser;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateSellerUserDto;
import com.waterProject.waterShop.dto.response.SellerUserDto;

public interface SellerUserBuilder {

    SellerUserDto build(SellerUser sellerToUser);

    SellerUser build(CreateSellerUserDto request,
                     Seller seller,
                     User user);

    void update(SellerUser sellerToUser,
                CreateSellerUserDto request,
                Seller seller,
                User user);
}
