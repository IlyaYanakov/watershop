package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.enums.ProductContainerMaterialType;
import com.waterProject.waterShop.domain.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    Long id;
    String name;
    ProductType productType;
    ProductContainerMaterialType productContainerMaterialType;
    int price;
    float volume;
    SellerDto seller;
    ManufacturerDto manufacturer;
}
