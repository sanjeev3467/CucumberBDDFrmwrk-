package apiServicesTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC1_GetAPI1 {
	
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
		
		//Status Code validation
		
		int statusCode=response.getStatusCode();
		System.out.println("Status Code :"+statusCode);
		Assert.assertEquals(statusCode, 201);
		
		//Status Line validation
		
		String statusLine=response.getStatusLine();
		System.out.println("Status Line: "+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
		
		
	}
	

}
