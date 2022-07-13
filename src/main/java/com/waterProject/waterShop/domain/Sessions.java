package com.waterProject.waterShop.domain;


import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Table(name = "sessions" )
public class Sessions extends PersistentObject {

    @Column(name = "loginDate")
    Date loginDate;

    @Column(name = "logout_date")
    Date logoutDate;

    @Column(name = "id_user")
    Integer userId;

    @Column(name = "token")
    String token;
}
