package com.waterProject.waterShop.service.impl;

import com.waterProject.waterShop.builder.ProductOrderBuilder;
import com.waterProject.waterShop.repository.ProductOrderRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductOrderServiceImpl {
    ProductOrderRepository productOrderRepository;
    ProductOrderBuilder productOrderBuilder;

}
