package apiTestExamples;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetCallTest {

	@Test
	public void ListofusersTest() {
		
	
		
	RequestSpecification request=	RestAssured.given();
	
	Response response=request.get("https://reqres.in/api/users?page=2");
	
	Headers allheaders =response.getHeaders();
	
	for(Header allheaderdata : allheaders) {
		System.out.println("Key is====>" +allheaderdata.getName() +"and the value is ====>" +allheaderdata.getValue());
	}
	
	
	

	ResponseBody responsebody =response.getBody();
	
	
	
	
       
	

	}

}
