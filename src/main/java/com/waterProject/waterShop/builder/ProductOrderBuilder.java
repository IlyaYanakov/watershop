package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Product;
import com.waterProject.waterShop.domain.ProductOrder;
import com.waterProject.waterShop.dto.request.CreateProductOrderDto;
import com.waterProject.waterShop.dto.response.ProductOrderDto;
import org.hibernate.criterion.Order;

public interface ProductOrderBuilder {
    ProductOrderDto build(ProductOrder productToOrder);

    ProductOrder build(Product product, Order order, int count);

    void update(ProductOrder productToOrder,
                CreateProductOrderDto request,
                Product product,
                Order order);

}
