package com.waterProject.waterShop.utils;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class GeneratorHelper {
<<<<<<< HEAD
=======

>>>>>>> day--19-07-22-Ilya
    public String code() {
        Random randomCode = new Random();
        int number = randomCode.nextInt(9999);
        return String.format("%04d", number);
    }
}
