package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seller")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Seller extends PersistentObject {

    @Column(name = "name")
    String name;

    @Column(name = "inn")
    String inn;

    @Column(name = "bik")
    String bik;

    @Column(name = "description")
    String description;
}
