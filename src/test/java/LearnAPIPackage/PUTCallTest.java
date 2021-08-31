package LearnAPIPackage;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTCallTest {
	
	@Test
	public void testPUTCall() {
		
		RequestSpecification request =RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("title", "Nayanatitle");
		requestparams.put("author", "Nayanasmiraauthor");
		
		Response response=request.body(requestparams.toJSONString()).put("http://localhost:3000/posts/06");
		
		int statuscode=response.getStatusCode();
		
		
		Assert.assertEquals(statuscode, 200, "updated successfully");
		
		//request.body("json.author[2]", equalTo("Nayanasmiraauthor"));
		
		
		System.out.println(response.jsonPath().prettify());
		
	
		

}

	private ObjectMapper equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}