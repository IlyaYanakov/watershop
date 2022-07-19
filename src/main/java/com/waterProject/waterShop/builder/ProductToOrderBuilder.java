package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Order;
import com.waterProject.waterShop.domain.Product;
import com.waterProject.waterShop.domain.ProductToOrder;
import com.waterProject.waterShop.dto.request.CreateProductToOrderDto;
import com.waterProject.waterShop.dto.response.ProductToOrderDto;


public interface ProductToOrderBuilder {

    ProductToOrderDto build(ProductToOrder productToOrder);

    ProductToOrder build(Product product, Order order, int count);

    void update(ProductToOrder productToOrder,
                CreateProductToOrderDto request,
                Product product,
                Order order);

}
