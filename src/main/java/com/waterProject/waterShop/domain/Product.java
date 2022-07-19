package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import com.waterProject.waterShop.domain.enums.ProductContainerMaterialType;
import com.waterProject.waterShop.domain.enums.ProductType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "product")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product extends PersistentObject {

    @Column(name = "name")
    String name;

    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    ProductType productType;

    @Column(name = "product_container_material_type")
    @Enumerated(EnumType.STRING)
    ProductContainerMaterialType productContainerMaterialType;

    @Column(name = "price")
    Integer price;

    @Column(name = "volume")
    Float volume;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    Seller seller;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    Manufacturer manufacturer;

    @OneToMany(mappedBy = "product")
    List<ProductToOrder> productToOrders;
}
