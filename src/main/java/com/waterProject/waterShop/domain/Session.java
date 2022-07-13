package com.waterProject.waterShop.domain;


import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Table(name = "sessions" )
public class Session extends PersistentObject {

    @Column(name = "loginDate")
    Date loginDate;

    @Column(name = "logout_date")
    Date logoutDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(name = "token")
    String token;
}
