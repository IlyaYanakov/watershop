package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "countries")
@Entity
public class Country extends PersistentObject {

    @Column(name = "name")
    String name;
}
