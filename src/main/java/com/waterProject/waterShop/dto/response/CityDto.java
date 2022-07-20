package com.waterProject.waterShop.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CityDto {
    Long id;
    String name;
    CountryDto country;
}
