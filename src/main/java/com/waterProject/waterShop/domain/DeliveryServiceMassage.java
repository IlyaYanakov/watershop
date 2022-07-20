package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import com.waterProject.waterShop.domain.enums.MessageContextType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "delivery_service_message")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeliveryServiceMassage extends PersistentObject {

    @ManyToOne
    @JoinColumn(name = "recipient_id")
    User recipient;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    User sender;

    @Column(name = "context")
    String context;

    @Column(name = "message_context_type")
    @Enumerated(EnumType.STRING)
    MessageContextType messageContextType;

    @Column(name = "date")
    String date;
}
