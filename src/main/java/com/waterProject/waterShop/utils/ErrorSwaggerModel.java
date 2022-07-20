package com.waterProject.waterShop.utils;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class ErrorSwaggerModel {

    Date timestamp;
    Integer status;
    String error;
    String path;
}
