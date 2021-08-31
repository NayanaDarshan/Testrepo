package apiTestExamples;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class testGetCall {
	
	ObjectMapper objmap = new ObjectMapper();

	@Test
	public void getCallTesting() {
		//
	data3 datanew =	RestAssured.given().get("https://reqres.in/api/users/2").as(data3.class);
		
	System.out.println(datanew.toString());
	
		
		
		
		/*
		 * ResponseBody responsebody =response.getBody();
		 * 
		 * JsonPath jsonbody =responsebody.jsonPath();
		 * 
		 * List<userdata> ud =jsonbody.getList("data", userdata.class);
		 * 
		 * for (userdata USERDATA : ud) {
		 * 
		 * System.out.println("Email is ==> " +USERDATA.email);
		 * 
		 * }
		 */
		
		
		
	}
}
