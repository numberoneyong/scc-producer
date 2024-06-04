package io.beinspired.SCC_Producer.metdo;

import io.beinspired.SCC_Producer.metdo.controller.SurrendersController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class MetdoBase {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new SurrendersController());
    }
}
