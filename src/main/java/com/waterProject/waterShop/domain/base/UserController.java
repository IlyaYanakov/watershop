package com.waterProject.waterShop.domain.base;

import com.waterProject.waterShop.annotation.BaseApiResponse;
import com.waterProject.waterShop.annotation.BaseApiResponseEmpty;
import com.waterProject.waterShop.controller.base.AuthorizationController;
import com.waterProject.waterShop.dto.response.UserDto;
import com.waterProject.waterShop.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@RestController
@RequestMapping("user")
@Tag(name = "User")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController extends AuthorizationController {
    UserService userService;

    @Autowired
    public UserController(UserService userService, HttpServletRequest request, UserController userController, UserService userService1){
        super(request);
        this.userService = userService1;
    }

//    @Operation(summary = "��������� userId �� ������")
//    @BaseApiResponse
//    @PostMapping
//    public Long getUserId(@RequestBody String token){
//        return userService.getIdByToken(token);
//    }

//    @Operation(summary = "����������� ������������ (��������� ������)")
//    @BaseApiResponse
//    @PostMapping("auth")
//    public String auth(@RequestBody RegistrationDto request){
//        return userService.auth(request);
//    }
//
//    @Operation(summary = "����������� ������������")
//    @BaseApiResponseEmpty
//    @PostMapping("registration")
//    public void registration(@RequestBody RegistrationDto request) {
//        userService.registration(request);
//    }

    @BaseApiResponse
    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @BaseApiResponseEmpty
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}