package apiTestExamples;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class testGetCall1 {
	
	@Test
	public void getCallTest2() {
		
	RequestSpecification request=	RestAssured.given();
	
	Response response =request.get("https://reqres.in/api/users?page=2");

	ResponseBody responsebody =response.getBody();
	
	JsonPath jsonpath= responsebody.jsonPath();
	
	ObjectMapper objmap = new ObjectMapper();
	
	
	
	userdata[] userdata1 =jsonpath.getObject("data.email[0]", userdata[].class);
	

	
	for (userdata userdata2 : userdata1) {
		System.out.println("The email is ==>" +userdata2.email);
		
	}
		
	}

}
