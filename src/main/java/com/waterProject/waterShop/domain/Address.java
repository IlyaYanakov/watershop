package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
@Entity

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address extends PersistentObject {

    @Column(name = "latitude")
    Double latitude;

    @Column(name = "longitude")
    Double longitude;

    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

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
