package apiServicesTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC4_GetAPI3 {
	
	@Test
	public void get_Employees1() {
		
		//Specify Base URI
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
			
		//Response Object
		Response response=httprequest.request(Method.GET, "/employees");
		
		//Print Response as String in Console
		String responseData=response.getBody().asString();
		System.out.println("Response Body is :"+responseData);
		
		//Return all headers
		Headers allhdears=response.headers();//get all headers from response
		
		for(Header header:allhdears) {
			
			System.out.println(header.getName()+"---"+header.getValue());
			
		}
		
		
		
		
		
		
	}
	


}
