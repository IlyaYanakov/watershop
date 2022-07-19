package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateSellerDto;
import com.waterProject.waterShop.dto.response.SellerDto;

import java.util.List;

public interface SellerService {
    void create(CreateSellerDto request);
    List<SellerDto> getAll();
    void deleteById(Long id);
    SellerDto getById(Long id);
}
