package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.SellerBuilder;
import com.waterProject.waterShop.builder.SellerUserBuilder;
import com.waterProject.waterShop.builder.UserBuilder;
import com.waterProject.waterShop.domain.Seller;
import com.waterProject.waterShop.domain.SellerUser;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateSellerUserDto;
import com.waterProject.waterShop.dto.response.SellerUserDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SellerUserBuilderImpl implements SellerUserBuilder {

    SellerBuilder sellerBuilder;
    UserBuilder userBuilder;

    @Override
    public SellerUserDto build(SellerUser sellerToUser) {
        return SellerUserDto.builder()
                .id(sellerToUser.getId())
                .seller(sellerBuilder.build(sellerToUser.getSeller()))
                .user(userBuilder.build(sellerToUser.getUser()))
                .build();
    }

    @Override
    public SellerUser build(CreateSellerUserDto request, Seller seller, User user) {
        SellerUser sellerToUser = new SellerUser();
        sellerToUser.setSeller(seller);
        sellerToUser.setUser(user);
        sellerToUser.setCreatedAt(new Date());
        return sellerToUser;
    }

    @Override
    public void update(SellerUser sellerToUser, CreateSellerUserDto request, Seller seller, User user) {
        sellerToUser.setSeller(seller);
        sellerToUser.setUser(user);
        sellerToUser.setUpdatedAt(new Date());
    }
}
