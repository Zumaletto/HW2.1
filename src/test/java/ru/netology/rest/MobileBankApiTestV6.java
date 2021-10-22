package ru.netology.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MobileBankApiTestV6 {
    private RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("http://0.0.0.0:9999/api/v1")
            .setBasePath("/demo/accounts")
            .setPort(9999)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    @Test
    void shouldReturnDemoAccount() {
// Given - When - Then
        // Предусловия
        given()
                .spec(requestSpec) // со спецификацией проще (особенно когда много тестов)
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(404);
    }
}
