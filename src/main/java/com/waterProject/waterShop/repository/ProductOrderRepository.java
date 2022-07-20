package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder,Long> {
}
