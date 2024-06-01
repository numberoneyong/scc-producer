package io.beinspired.SCC_Producer.fraud;

import io.beinspired.SCC_Producer.controller.FraudController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestClass {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }
}
