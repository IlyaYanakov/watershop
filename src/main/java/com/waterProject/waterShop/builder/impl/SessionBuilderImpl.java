package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.SessionBuilder;
import com.waterProject.waterShop.builder.UserBuilder;
import com.waterProject.waterShop.domain.Session;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateSessionDto;
import com.waterProject.waterShop.dto.response.SessionDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SessionBuilderImpl implements SessionBuilder {
    UserBuilder userBuilder;
    @Override
    public SessionDto build(Session session) {
        return SessionDto.builder()
                .id(session.getId())
                .user(session.getUser())
                .loginDate(session.getLoginDate())
                .logoutDate(session.getLogoutDate())
                //.user(userBuilder.build(session.getUser()))
                .token(session.getToken())
                .build();

    }

    @Override
    public Session build(CreateSessionDto request,
                         User user) {
        Session session = new Session();
        session.setUser(request.getUser());
        session.setLoginDate(session.getLoginDate());
        session.setLogoutDate(session.getLogoutDate());
        session.setUser(user);
        session.setToken(session.getToken());
        session.setCreatedAt(new Date());
        return session;
    }

    @Override
    public void update(Session session,
                       CreateSessionDto request,
                       User user) {
        session.setLoginDate(request.getLoginDate());
        session.setLogoutDate(request.getLogoutDate());
        session.setUser(user);
        session.setToken(request.getToken());
        session.setUpdatedAt(new Date());
    }
}
