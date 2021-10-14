package com.fabridinapoli.quarkusgradle

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test

@QuarkusTest
class HelloWorldResourceTestShould {
    @Test
    fun testHelloEndpoint() {
        RestAssured.given()
            .`when`()["/hello/greeting/fabri"]
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`("hello fabri"))
    }
}
