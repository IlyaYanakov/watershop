package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<Address, Long> {
}
