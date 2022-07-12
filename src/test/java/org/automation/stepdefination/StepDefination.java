package org.automation.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.automation.resourses.apiResourse;
import org.automation.testdata.TestDatabind;
import org.automation.utils.Utils;

public class StepDefination extends Utils {

	RequestSpecification specificationresponse;
	Response apiResponse;
	TestDatabind data = new TestDatabind();

	@Given("Add User Payload {string},{string}")
	public void add_user_payload(String name, String job) throws IOException {
		specificationresponse = given().log().all().spec(requestSpecification())
				.body(data.customerInfomation(name, job));
	}

	@When("User call the api with the POST {string} request")
	public void user_call_the_api_with_the_post_http_request(String resourse) {
		System.out.println(apiResourse.valueOf(resourse).getResource());
		apiResponse = specificationresponse.post("" + apiResourse.valueOf(resourse).getResource() + "");
	}

	@Then("Status in response Body is OK And Status Code is {int}")
	public void status_in_response_body_is_ok_and_status_code_is(Integer int1) {

		System.out.println(apiResponse.getStatusCode());
		assertEquals(apiResponse.getStatusCode(), 201);

	}

}
