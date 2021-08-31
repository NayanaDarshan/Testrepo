package LearnAPIPackage;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseAPIClass {
	
	@BeforeClass
	public void getBasedata() {
		
		RestAssured.baseURI="http://localhost:3000/posts/";	
		
		RestAssured.authentication= RestAssured.preemptive().basic("username", "password");
	}

}
