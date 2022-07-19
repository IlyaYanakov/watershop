package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;

//адрес клиента
@Getter
@Setter
@Entity
@Table(name = "address")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address extends PersistentObject {

    @Column(name = "latitude")
    String latitude;

    @Column(name = "longitude")
    String longitude;

    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @Column(name = "street")
    String street;

    @Column(name = "house")
    String house;

    @Column(name = "flat")
    String flat;

    @Column(name = "level")
    String level;

    @Column(name = "elevator")
    boolean elevator;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;


}
