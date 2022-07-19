package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.DeliveryServiceMassageBuilder;
import com.waterProject.waterShop.builder.UserBuilder;
import com.waterProject.waterShop.domain.DeliveryServiceMassage;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateDeliveryServiceMassageDto;
import com.waterProject.waterShop.dto.response.DeliveryServiceMessageDto;
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
public class DeliveryServiceMassageBuilderImpl implements DeliveryServiceMassageBuilder {

    UserBuilder userBuilder;

    @Override
    public DeliveryServiceMessageDto build(DeliveryServiceMassage deliveryServiceMassage) {
        return DeliveryServiceMessageDto.builder()
                .id(deliveryServiceMassage.getId())
                .recipient(userBuilder.build(deliveryServiceMassage.getRecipient()))
                .sender(userBuilder.build(deliveryServiceMassage.getSender()))
                .context(deliveryServiceMassage.getContext())
                .messageContextType(deliveryServiceMassage.getMessageContextType())
                .date(deliveryServiceMassage.getDate())
                .build();
    }

    @Override
    public DeliveryServiceMassage build(CreateDeliveryServiceMassageDto request,
                                        User recipient, User sender) {
        DeliveryServiceMassage deliveryServiceMassage = new DeliveryServiceMassage();
        deliveryServiceMassage.setRecipient(recipient);
        deliveryServiceMassage.setSender(sender);
        deliveryServiceMassage.setContext(deliveryServiceMassage.getContext());
        deliveryServiceMassage.setMessageContextType(deliveryServiceMassage.getMessageContextType());
        deliveryServiceMassage.setDate(deliveryServiceMassage.getDate());
        deliveryServiceMassage.setCreatedAt(new Date());
        return deliveryServiceMassage;
    }

    @Override
    public void update(DeliveryServiceMassage deliveryServiceMassage,
                       CreateDeliveryServiceMassageDto request,
                       User recipient, User sender) {
        deliveryServiceMassage.setRecipient(recipient);
        deliveryServiceMassage.setSender(sender);
        deliveryServiceMassage.setContext(request.getContext());
        deliveryServiceMassage.setMessageContextType(request.getMessageContextType());
        deliveryServiceMassage.setDate(request.getDate());
        deliveryServiceMassage.setUpdatedAt(new Date());
    }
}
