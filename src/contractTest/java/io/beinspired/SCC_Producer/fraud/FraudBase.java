package io.beinspired.SCC_Producer.fraud;

import io.beinspired.SCC_Producer.fraud.controller.FraudController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class FraudBase {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }
}
