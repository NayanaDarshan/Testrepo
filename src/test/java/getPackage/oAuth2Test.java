package getPackage;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oAuth2Test {
	
	@Test
	public void verifyOAuth2Test() {
		
		String a[] = new String[100];
		
	Response response=	RestAssured.given().auth()
		.oauth2("ee272ed23d5befef27e51cc53ed3c6e27e337e4e5daba5efa2e269842a153385")
		.get("https://gorest.co.in/public-api/users");
						/*//./*
							 * then() .extract().path("data.name");
							 */
		
		  int code= response.getStatusCode();
		  
		  String body= response.getBody().jsonPath().prettify();
		  
		  System.out.println("The code is ==>"+code);
		  
		  System.out.println("The body is===>" +body);
		  
		  String name=response.jsonPath().get("data[1].email");
		 
	
	System.out.println(name);

		

	}

}  