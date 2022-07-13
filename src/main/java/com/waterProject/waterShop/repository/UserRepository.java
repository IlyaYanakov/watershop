package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
