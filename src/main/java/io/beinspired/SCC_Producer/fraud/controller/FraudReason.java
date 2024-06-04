package io.beinspired.SCC_Producer.fraud.controller;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FraudReason {
    private String reason;

    public static FraudReason sampleOk() {
        return new FraudReason("accepted");
    }

    public static FraudReason sampleFraud() {
        return new FraudReason("mount too high");
    }
}
