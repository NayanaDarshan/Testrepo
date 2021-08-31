package LearnAPIPackage;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTCallTest extends BaseAPIClass{

	@Test
	public void testPOSTCall() {
		
		RequestSpecification request =RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("id", "07");
		requestparams.put("title", "json-server07");
		requestparams.put("author", "Nayana Raghu7");
		
		Response response =request.body(requestparams.toJSONString()).post();
		
		int statuscode=response.getStatusCode();
		
		Assert.assertEquals(statuscode, 201, "The data created successfully");
		
		System.out.println(response.jsonPath().prettify());
	}
}
