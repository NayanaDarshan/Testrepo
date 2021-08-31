package getPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getRequestTest {

	@Test
	public void testResponsecode() {
		
	Response response=	get("https://gorest.co.in/public-api/users");
	
	short code=(short)response.getStatusCode();
	
	String data =response.asString();
	
	long time=response.getTime();
	
	System.out.println("The status code is ===>"+code);
	
	System.out.println("The data is ===>" +data);
	
	System.out.println("The time is ===>" +time);
	
	Assert.assertEquals(code, 200, "The get response code gave data correctly");
	

	}

}
