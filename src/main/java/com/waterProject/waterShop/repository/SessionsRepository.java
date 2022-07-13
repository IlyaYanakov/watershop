package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionsRepository extends JpaRepository<Session, Long> {
}
