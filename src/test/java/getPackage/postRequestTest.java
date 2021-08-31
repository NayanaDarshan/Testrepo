package getPackage;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class postRequestTest {
	
	@Test
	public void postCallTest() {
		
	RequestSpecification request=	RestAssured.given();
	
	//request.header("Content-Type", "application/json");
	
	org.json.simple.JSONObject json = new org.json.simple.JSONObject();
	
	json.put("name", "smirad");
	json.put("job", "leader");
	
	request.body(json.toString());
	
      Response response =request.post("https://reqres.in/api/users");
      int code =response.getStatusCode();
      
      String res= response.getBody().jsonPath().prettify();
     
     System.out.println("The code is ===>" +code);
     
     System.out.println("The response body is ===>" +res);
     
     
     JsonPath jsonpath=response.jsonPath();
     
     String id =jsonpath.get("id");
     
     System.out.println("The created id is ===>" +id);
     
     Assert.assertEquals(code, 201, "The data is created");
		
	}

}
