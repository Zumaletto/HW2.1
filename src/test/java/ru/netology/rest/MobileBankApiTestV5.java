package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class MobileBankApiTestV5 {
    @Test
    void shouldReturnDemoAccount(){
        given()
                .baseUri("http://0.0.0.0:9999/api/v1")
                .when()
                .get("/demo/accounts")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("every{it.balance >= 0}", is(true))
                ;
    }
}
