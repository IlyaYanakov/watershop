package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Seller;
import com.waterProject.waterShop.dto.request.CreateSellerDto;
import com.waterProject.waterShop.dto.response.SellerDto;

public interface SellerBuilder {
    SellerDto build(Seller seller);

    Seller build(CreateSellerDto request);

    void update(Seller seller, CreateSellerDto request);

}
