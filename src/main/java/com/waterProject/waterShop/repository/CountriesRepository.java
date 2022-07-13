package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Countries;
import liquibase.change.core.LoadDataChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, Long> {
}
