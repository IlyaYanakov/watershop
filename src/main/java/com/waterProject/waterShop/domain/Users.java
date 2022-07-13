package com.waterProject.waterShop.domain;


import com.waterProject.waterShop.domain.base.PersistentObject;
import com.waterProject.waterShop.domain.enums.UserType;
import liquibase.pro.packaged.S;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class Users extends PersistentObject {

    @Column(name = "id_city")
    Integer cityId;

    @Column(name = "user_type")
    UserType userType;

    @Column(name = "fio")
    String fullName;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;

    @Column(name = "email")
    String email;

    @Column(name = "phone_number")
    String phoneNumber;


}
