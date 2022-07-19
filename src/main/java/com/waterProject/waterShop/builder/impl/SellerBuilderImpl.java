package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.SellerBuilder;
import com.waterProject.waterShop.domain.Seller;
import com.waterProject.waterShop.dto.request.CreateSellerDto;
import com.waterProject.waterShop.dto.response.SellerDto;

import java.util.Date;

public class SellerBuilderImpl implements SellerBuilder {
    @Override
    public SellerDto build(Seller seller) {
        return SellerDto.builder()
                .id(seller.getId())
                .name(seller.getName())
                .bik(seller.getBik())
                .inn(seller.getInn())
                .description(seller.getDescription())
                .build();

    }

    @Override
    public Seller build(CreateSellerDto request) {
        Seller seller = new Seller();
        seller.setName(request.getName());
        seller.setInn(request.getInn());
        seller.setBik(request.getBik());
        seller.setDescription(request.getDescription());
        seller.setCreatedAt(new Date());
        return seller;
    }

    @Override
    public void update(Seller seller, CreateSellerDto request) {
        seller.setName(request.getName());
        seller.setInn(request.getInn());
        seller.setBik(request.getBik());
        seller.setDescription(request.getDescription());
        seller.setUpdatedAt(new Date());

    }
}
