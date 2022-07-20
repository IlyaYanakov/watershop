package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateProductDto;
import com.waterProject.waterShop.dto.response.ProductDto;

import java.util.List;

public interface ProductService {
    void create(CreateProductDto request);
    List<ProductDto> getAll();
    ProductDto getById(Long id);
    void update(Long id, CreateProductDto request);
    void deleteById(Long id);

    List<ProductDto> filter(List<Long> manufacturersIds, Integer minPrice, Integer maxPrice, List<Long> sellersIds, Float minVolume, Float maxVolume);

}
