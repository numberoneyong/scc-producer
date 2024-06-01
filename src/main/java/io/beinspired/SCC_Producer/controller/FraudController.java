package io.beinspired.SCC_Producer.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudController {

    @PutMapping(value = "/fraudcheck", consumes="application/json", produces="application/json")
    public Response check(@RequestBody LoanRequest loanRequest) {

        if (loanRequest.getLoanAmount() > 10000) {
            return Response.sampleFraud();
        } else {
            return Response.sampleOk();
        }
    }
}

