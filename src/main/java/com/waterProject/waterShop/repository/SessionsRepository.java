package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionsRepository extends JpaRepository<Sessions, Long> {
}
