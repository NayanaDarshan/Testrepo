package apiTestExamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class registerpost {
	
	@Test
	public void getRegisterPost() {
		
		RequestSpecification request =RestAssured.given();
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("name", "Nayana Raghu");
		
		requestparams.put("job", "leader");
		
		Response response =request.body(requestparams.toJSONString()).post("https://reqres.in/api/users");
		
		ResponseBody responsebody = response.getBody();
		
	//Deserialize
		RegistrationSucessResponse Registersuccessresponse =responsebody.as(RegistrationSucessResponse.class);
	
		Assert.assertEquals("Nayana Raghu",Registersuccessresponse.name );
	}

}
