package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "salerUsers")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellerUser extends PersistentObject {

    @ManyToOne
    @JoinColumn(name = "sale_organisation_id")
    Seller seller;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
