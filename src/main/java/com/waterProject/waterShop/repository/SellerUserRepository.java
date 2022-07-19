package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.SellerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerUserRepository extends JpaRepository<SellerUser,Long> {

}
