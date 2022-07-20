package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.DeliveryServiceMassage;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateDeliveryServiceMassageDto;
import com.waterProject.waterShop.dto.response.DeliveryServiceMessageDto;

public interface DeliveryServiceMassageBuilder {

    DeliveryServiceMessageDto build(DeliveryServiceMassage deliveryServiceMassage);

    DeliveryServiceMassage build(CreateDeliveryServiceMassageDto request,
                                 User recipient, User sender);

    void update(DeliveryServiceMassage deliveryServiceMassage,
                CreateDeliveryServiceMassageDto request,
                User recipient, User sender);
}
