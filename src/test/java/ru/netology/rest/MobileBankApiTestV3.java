package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class MobileBankApiTestV3 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("http://0.0.0.0:9999/api/v1")
                .when()
                .get("/demo/accounts")
                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=UTF-8")
                .header("Content-Length", "433")
                .header("Connection", "keep-alive")
                .contentType(ContentType.JSON)
                .body(matchesJsonSchemaInClasspath("accounts.schema.json"));

    }
}
