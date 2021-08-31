package getPackage;

import java.util.List;

import getPackage.Data;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getcallnewtest {

	// ee272ed23d5befef27e51cc53ed3c6e27e337e4e5daba5efa2e269842a153385

	@Test
	public void getNewCallTest() {

		RequestSpecification request = RestAssured.given();

		Response response = request.auth()
				.oauth2("\r\n" + "ee272ed23d5befef27e51cc53ed3c6e27e337e4e5daba5efa2e269842a153385")
				.get("https://gorest.co.in/public-api/users");

		JsonPath jsondata = response.jsonPath();

		// Conversions of JSON Array to List<String> Deserilization step1

		List<String> namedata = jsondata.getList("data.email");

		for (String names : namedata) {

			System.out.println("The email id's are is as below");
			System.out.println(names);
		}

		// Conversions of JSON Array to List<String> using class step2

		/*String jsontext= 
		List<Data> data1 = jsondata.getList("data", Data.class);
		
		for( Data data2: data1) {
			
			System.out.println(data2.getName());
		}

	}*/

}
}