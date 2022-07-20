package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Manufacturer;
import com.waterProject.waterShop.domain.Product;
import com.waterProject.waterShop.domain.Seller;
import com.waterProject.waterShop.dto.request.CreateProductDto;
import com.waterProject.waterShop.dto.response.ProductDto;

public interface ProductBuilder {

    ProductDto build(Product product);

    Product build(CreateProductDto request,
                  Manufacturer manufacturer,
                  Seller seller);

    void update(Product product,
                CreateProductDto request,
                Manufacturer manufacturer,
                Seller seller);
}
