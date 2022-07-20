package com.waterProject.waterShop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrderDto {
    Long id;
    ProductDto product;
    OrderDto order;
    double price;
    int count;
}
