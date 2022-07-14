package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    Long id;
    String name;
    Country country;
}
