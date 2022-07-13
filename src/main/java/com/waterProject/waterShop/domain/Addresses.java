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
@Table(name = "address")
@Entity

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Addresses extends PersistentObject {

    @Column(name = "latitude")
    Double latitude;

    @Column(name = "longitude")
    Double longitude;

    @Column(name = "id_city")
    Integer cityId;

    @Column(name = "id_user")
    Integer userId;

    @Column(name = "street")
    String street;

    @Column (name = "house")
    String house;

    @Column(name = "floor")
    String floor;

    @Column(name = "level")
    Integer level;

    @Column(name = "withLift")
    Boolean withLift;
}
