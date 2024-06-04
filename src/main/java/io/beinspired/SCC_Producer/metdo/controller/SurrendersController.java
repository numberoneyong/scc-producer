package io.beinspired.SCC_Producer.metdo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class SurrendersController {

    @PostMapping(value = "/surrenders", consumes="application/json", produces="application/json")
    public Surrenders check(@RequestBody Product product) {
        if (product.getProductId() == null) {
            throw new NullPointerException("상품ID가 존재하지 않습니다.");
        }

        // pre-processing...
        // some flows...
        BigDecimal surrenders = product.getFaceAmount().multiply(new BigDecimal("0.9"));
        // post-processing...
        return new Surrenders(surrenders);
    }
}

