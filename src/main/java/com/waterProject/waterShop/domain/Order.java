package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import com.waterProject.waterShop.domain.enums.PayMethodType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "orders")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends PersistentObject {
    @Column(name = "name")
    String name;

    @Column(name = "address")
    String address;

    @Column(name = "phoneNumber")
    String phoneNumber;

    @Column(name = "context_type")
    @Enumerated(EnumType.STRING)
    PayMethodType payMethodType;

    @OneToMany(mappedBy = "product")
    List<ProductOrder> productsToOrders;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
