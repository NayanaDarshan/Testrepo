package getPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getTest {
	
	@Test
	public void getCallTest() {
		
	RequestSpecification request=	RestAssured.given();
	
	Response response=request.get("https://reqres.in/api/users");
	
	int code=response.getStatusCode();
	
	String data =response.getBody().asString();
	
	System.out.println(data);
	Assert.assertEquals(code, 200);
		
	

	
	}

}
