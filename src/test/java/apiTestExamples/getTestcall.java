package apiTestExamples;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class getTestcall {
	
	@Test
	public void verifyGetCallTest() {
		
		given().get("https://corona-virus-stats.herokuapp.com/api/v1/cases/general-stats").then()
		.body("data.recovery_cases", equalTo("104,898,554"))
		.and().body("data.death_cases", equalTo("2,840,296")).statusCode(200);
		
	}

}
