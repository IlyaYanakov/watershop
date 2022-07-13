package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Country, Long> {
}
