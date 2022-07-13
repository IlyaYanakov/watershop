package com.waterProject.waterShop.domain;

import com.waterProject.waterShop.domain.base.PersistentObject;
import com.waterProject.waterShop.domain.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "messages")
@Entity
public class Messages extends PersistentObject {

    @Column(name = "id_from")
    Integer fromId;

    @Column(name = "id_to")
    Integer toId;

    @Column (name = "content")
    String content;

    @Column(name = "content_type")
    MessageType contentType;


}
