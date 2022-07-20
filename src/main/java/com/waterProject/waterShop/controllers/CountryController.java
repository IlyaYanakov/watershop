package com.waterProject.waterShop.controllers;

import com.waterProject.waterShop.annotation.BaseApiResponse;
import com.waterProject.waterShop.annotation.BaseApiResponseEmpty;
import com.waterProject.waterShop.controllers.base.AuthorizationController;
import com.waterProject.waterShop.dto.request.CreateCountryDto;
import com.waterProject.waterShop.dto.response.CountryDto;
import com.waterProject.waterShop.service.CountryService;
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
@RequestMapping("country")
@Tag(name = "Country")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CountryController extends AuthorizationController {

    CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService, HttpServletRequest request) {
        super(request);
        this.countryService = countryService;
    }

    @BaseApiResponseEmpty
    @PostMapping
    public void create(@RequestBody CreateCountryDto request) {
        countryService.create(request);
    }

    @BaseApiResponse
    @GetMapping
    public List<CountryDto> getAll() {
        return countryService.getAll();
    }

    @BaseApiResponse
    @GetMapping("/{id}")
    public CountryDto getById(@PathVariable Long id) {
        return countryService.getById(id);
    }

    @BaseApiResponseEmpty
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CreateCountryDto request) {
        countryService.update(id, request);
    }

    @BaseApiResponseEmpty
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        countryService.deleteById(id);
    }

}
