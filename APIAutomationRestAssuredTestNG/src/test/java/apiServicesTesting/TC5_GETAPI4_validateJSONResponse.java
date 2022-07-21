package apiServicesTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC5_GETAPI4_validateJSONResponse {

	@Test
	void get_Employees() {
		
		//Specify Base URI
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
			
		//Response Object
		Response response=httprequest.request(Method.GET, "/employees");
		
		//Print Response as String in Console
		String responseData=response.getBody().asString();
		System.out.println("Response Body is :"+responseData);
		
		Assert.assertEquals(responseData.contains("Tiger Nixon"), true);
		
		
		
		
	}
	

}
