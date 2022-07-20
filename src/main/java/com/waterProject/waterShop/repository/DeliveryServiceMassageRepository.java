package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.DeliveryServiceMassage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryServiceMassageRepository extends JpaRepository<DeliveryServiceMassage, Long> {
}
