package getPackage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class cookiebasedTest {
	
	
	@Test
	public void getCookiedata() {
		
		JSONObject json= new JSONObject();
		
		
		json.put("username", "NAYANA RAGHU");
		json.put("passowrd", "Epicor@123");
		
		Response response=RestAssured.given().header("Content-Type", "application/json").body(json)
				.post("https://epicor.atlassian.net/rest/auth/1/session");
		
		System.out.println(response.getBody().jsonPath().prettify());
		System.out.println(response.getCookies());
	}

}
