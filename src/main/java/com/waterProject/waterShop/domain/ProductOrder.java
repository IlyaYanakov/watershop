package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.criterion.Order;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product_to_order")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductOrder extends PersistentObject {
    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    @Column(name = "count")
    int count;

}
