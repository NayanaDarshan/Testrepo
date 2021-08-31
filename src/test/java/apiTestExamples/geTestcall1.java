package apiTestExamples;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class geTestcall1 {

	@Test
	public void getCallTest() {

		// RestAssured.baseURI="";

		RequestSpecification request = RestAssured.given();

		Response response = request.get("https://reqres.in/api/users?page=2");
		
		
		System.out.println(response.getBody().asString());

		JsonPath jsonbody = response.getBody().jsonPath();
		
		System.out.println(jsonbody.prettify());
		

		List<String> emaildata = jsonbody.get("data.first_name");

		emaildata.stream().forEach(ele -> System.out.println(ele));

	}

}
