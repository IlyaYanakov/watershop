package com.waterProject.waterShop.dto.request;

import com.waterProject.waterShop.domain.enums.ProductContainerMaterialType;
import com.waterProject.waterShop.domain.enums.ProductType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateProductDto {
    String name;
    ProductType productType;
    ProductContainerMaterialType productContainerMaterialType;
    int price;
    float volume;
    Long sellerId;
    Long manufactureId;

}
