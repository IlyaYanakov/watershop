package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "city")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City extends PersistentObject {

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;
}
