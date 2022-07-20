package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateProductDto;

public interface ProductOrderService {
    void create(CreateProductDto request);
}
