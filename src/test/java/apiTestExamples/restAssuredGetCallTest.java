package apiTestExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.math.BigDecimal;

public class restAssuredGetCallTest {
	
	
	
	
	@Test
	public void getCallTest() {
		
		/*
		 * given().when().get(
		 * "https://corona-virus-stats.herokuapp.com/api/v1/cases/countries-search?search=USA"
		 * ).then() .body("data.paginationMeta.currentPage", equalTo(1))
		 * .and().statusCode(200).and() .body("data.rows[0].country", equalTo("USA"));
		 */
		
		Response response=given().when().get("https://corona-virus-stats.herokuapp.com/api/v1/cases/countries-search?search=USA");	

	        ResponseBody responsebody= response.getBody();
	        
	        String responsedata=responsebody.asString();
	        
	        System.out.println(responsedata);
	        
	        Assert.assertTrue(responsedata.contains("USA"));
	        
	        
	       String data= responsebody.jsonPath().prettify();
	       
	       System.out.println(data);

	       
	       JsonPath jsondata=responsebody.jsonPath();
	       
	       System.out.println(jsondata.get("data.rows[0].country"));
	       
	       Assert.assertEquals("data.rows[0].country","USA", "The data found!");

		
	}

}
