package io.beinspired.SCC_Producer.metdo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String productId;
    private BigDecimal faceAmount;

    public static Product sample() {
        return new Product("A0572", new BigDecimal("100000000.0"));
    }
}
