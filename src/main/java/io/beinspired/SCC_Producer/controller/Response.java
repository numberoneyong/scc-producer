package io.beinspired.SCC_Producer.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Response {
    private FraudCheckStatus fraudCheckStatus;
    private String reason;

    public static Response sampleOk() {
        return new Response(FraudCheckStatus.OK, "Accepted");
    }

    public static Response sampleFraud() {
        return new Response(FraudCheckStatus.FRAUD, "Amount too high");
    }
}
