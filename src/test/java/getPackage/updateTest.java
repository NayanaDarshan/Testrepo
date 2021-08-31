package getPackage;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateTest {
	
	@Test
	public  void putTestcall() {
		
		RequestSpecification request =RestAssured.given();
		
		
		
		request.header("Content-Type", "application/json");
		
		org.json.simple.JSONObject json = new org.json.simple.JSONObject();
		
		json.put("name", "nayana");
		json.put("job", "leader");
		
		request.body(json.toString());
		
		Response response=request.put("https://reqres.in/api/users");
		int code=response.getStatusCode();
		
		System.out.println(code);
		Assert.assertEquals(code, 200);
		
		long time =response.getTime();
		
		System.out.println(time);	
		
		
		
	}

}
