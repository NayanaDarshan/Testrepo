package apiTestExamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postcallnewTest {
	
	@Test
	public void verifyPostCallTest() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification request =RestAssured.given();
	
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("name", "morpheus");
		requestparams.put("job", "leader");
	
	     request.body(requestparams.toJSONString());
	     
	     
	     Response response =request.post("api/users");
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.jsonPath().prettify());
		
		System.out.println(response.jsonPath().get("id"));
		
		
	}

}
