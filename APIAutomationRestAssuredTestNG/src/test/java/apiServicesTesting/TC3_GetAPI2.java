package apiServicesTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC3_GetAPI2 {

	@Test
	void validate_Headers() {
		
		//Specify Base URI
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employee";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
			
		//Response Object
		Response response=httprequest.request(Method.GET, "/1");
		
		//Print Response as String in Console
		String responseData=response.getBody().asString();
		System.out.println("Response Body is :"+responseData);
		
		//Status Code validation
		
		int statusCode=response.getStatusCode();
		System.out.println("Status Code :"+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//Validating headers from response
		String contenttype=response.header("content-type");
		System.out.println("Content Type: "+contenttype);
		Assert.assertEquals(contenttype, "application/json");

		String contentEncode=response.header("host-header");
		System.out.println("Content Encoding: "+contentEncode);
		Assert.assertEquals(contentEncode,"c2hhcmVkLmJsdWVob3N0LmNvbQ==");
		
		
		
		
		
		
	}

	
}
