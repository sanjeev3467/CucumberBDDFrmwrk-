package apiServicesTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC6_validateAlldatafromResponse {

	@Test
	void validate_AllResponseDta() {
		
		//Specify Base URI
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
			
		//Response Object
		Response response=httprequest.request(Method.GET,"employee/1");
		
		JsonPath jsonpath1=response.jsonPath();
		
		String jspath1=jsonpath1.get("employee_name");
		System.out.println("Employee name is : "+jspath1);
		//System.out.println(jsonpath1.get("employee_name"));
		
		
	}
	

	
}
