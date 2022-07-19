package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import com.waterProject.waterShop.domain.enums.UserType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class User extends PersistentObject {

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    UserType type;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;

//    @Column(name = "email")
//    String email;

    @Column(name = "phone_number")
    String phoneNumber;

//    @ManyToOne
//    @JoinColumn(name = "city_id")
//    City city;

//    @ManyToOne
//    @JoinColumn(name = "address_id")
//    Address address;




}
