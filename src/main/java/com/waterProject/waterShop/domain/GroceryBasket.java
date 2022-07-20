package com.waterProject.waterShop.domain;


import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "grocery_basket")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GroceryBasket extends PersistentObject {

    @ManyToOne
    @JoinColumn(name = "userid")
    User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

}
