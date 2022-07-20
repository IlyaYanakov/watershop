package com.waterProject.waterShop.service.impl;

import com.waterProject.waterShop.builder.ProductBuilder;
import com.waterProject.waterShop.dto.request.CreateProductDto;
import com.waterProject.waterShop.dto.response.ProductDto;
import com.waterProject.waterShop.repository.ManufacturerRepository;
import com.waterProject.waterShop.repository.ProductRepository;
import com.waterProject.waterShop.repository.SellerRepository;
import com.waterProject.waterShop.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;
    ManufacturerRepository manufacturerRepository;
    SellerRepository sellerRepository;
    ProductBuilder productBuilder;
    @Override
    public void create(CreateProductDto request) {

    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, CreateProductDto request) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<ProductDto> filter(List<Long> manufacturersIds, Integer minPrice, Integer maxPrice, List<Long> sellersIds, Float minVolume, Float maxVolume) {
        return null;
    }
}
