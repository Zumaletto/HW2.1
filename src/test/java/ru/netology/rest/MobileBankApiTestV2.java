package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MobileBankApiTestV2 {
    @Test
    void shouldReturnDemoAccount(){
        given()
                .baseUri("http://0.0.0.0:9999/api/v1")
                .when()
                .get("/demo/accounts")
                .then()
                .statusCode(200);
    }
}
