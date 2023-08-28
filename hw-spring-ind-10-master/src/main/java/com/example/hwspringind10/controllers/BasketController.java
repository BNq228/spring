package com.example.hwspringind10.controllers;

import com.example.hwspringind10.servicies.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Map;
@@ -13,6 +13,11 @@
@RequestMapping("/order")
public class BasketController {

    @ExceptionHandler({MethodArgumentTypeMismatchException.class, NumberFormatException.class})
    public String handleException(MethodArgumentTypeMismatchException e) {
        return "Не тот формат ввода";
    }

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
