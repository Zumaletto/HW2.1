package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MobileBankApiTestV4 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("http://0.0.0.0:9999/api/v1")
                .when()
                .get("/demo/accounts")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("", hasSize(3))
                .body("[0].currency", equalTo("RUB"))
                .body("[0].balance", greaterThanOrEqualTo(0))
        ;
    }

}
