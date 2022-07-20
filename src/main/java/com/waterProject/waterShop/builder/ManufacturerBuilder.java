package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Manufacturer;
import com.waterProject.waterShop.dto.request.CreateManufacturerDto;
import com.waterProject.waterShop.dto.response.ManufacturerDto;

public interface ManufacturerBuilder {
    ManufacturerDto build(Manufacturer manufacturer);

    Manufacturer build(CreateManufacturerDto request);

    void update(Manufacturer manufacturer, CreateManufacturerDto request);

}
