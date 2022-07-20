package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateOrderDto;
import com.waterProject.waterShop.dto.response.OrderDto;

import java.util.List;

public interface OrderService {
    void create(CreateOrderDto request);
    List<OrderDto> getAll();
    List<OrderDto> getByUserId(Long id);
}
