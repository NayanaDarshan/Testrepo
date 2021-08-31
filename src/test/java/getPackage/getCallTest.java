package getPackage;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;


import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class getCallTest {

	@Test
	public void verifyGetCallTest() {
		

		/*
		 * Response response
		 * =RestAssured.given().get("https://reqres.in/api/users?page=2");
		 * 
		 * int code=response.getStatusCode();
		 * 
		 * System.out.println(code);
		 * 
		 *
		 */
		
    given().get("https://reqres.in/api/users?page=2").then().body("data[1].id", equalTo(8));
	}
	
	
	@Test
	public void verifyPostCallTest() {
		
		JSONObject request = new JSONObject();
		
		request.put("email", "nayana.28mr@gmail.com");
		request.put("password", "pistol");
		
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).post("https://reqres.in/api/register").then().statusCode(201);
		
		
		
		
	}
}