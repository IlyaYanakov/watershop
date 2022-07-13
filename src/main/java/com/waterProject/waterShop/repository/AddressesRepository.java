package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<Addresses, Long> {
}
