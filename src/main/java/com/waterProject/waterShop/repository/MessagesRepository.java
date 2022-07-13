package com.waterProject.waterShop.repository;

import com.waterProject.waterShop.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Message, Long> {

}
