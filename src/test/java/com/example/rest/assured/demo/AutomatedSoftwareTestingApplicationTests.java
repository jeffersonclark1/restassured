package com.example.rest.assured.demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutomatedSoftwareTestingApplicationTests {

	@Test
	public void testStatusAccepted(){
		when().get("https://ws.apicep.com/cep/06233030.json")
				.then()
				.statusCode(200)
				.body("status", equalTo(200));
	}

	@Test
	public void testStatusNotAccepted(){
		when().get("https://ws.apicep.com/cep/0000000.json")
				.then()
				.statusCode(200)
				.body("status", equalTo(400));
	}

}
