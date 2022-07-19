package com.waterProject.waterShop.controller;

import com.waterProject.waterShop.controller.base.AuthorizationController;
import com.waterProject.waterShop.service.SellerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Scope
@RestController
@RequestMapping("seller")
@Tag(name = "seller")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SellerController extends AuthorizationController {
    SellerService sellerService;

    @Autowired
    public SellerController(HttpServletRequest request, SellerService sellerService) {
        super(request);
        this.sellerService = sellerService;
    }


}
