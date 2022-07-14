package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Session;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateSessionDto;
import com.waterProject.waterShop.dto.response.SessionDto;

public interface SessionBuilder {
    SessionDto build(Session session);

    Session build(CreateSessionDto request,
                  User user);

    void update(Session session,
                CreateSessionDto request,
                User user);
}
