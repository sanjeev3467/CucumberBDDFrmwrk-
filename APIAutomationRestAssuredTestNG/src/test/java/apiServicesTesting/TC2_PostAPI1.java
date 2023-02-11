package apiServicesTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC2_PostAPI1 {
	
	@Test
	void Create_New_Record() {
		
		//Specify Base URI
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
		
		//Json Request Payload sending along with POST Request
		JSONObject requestParams=new JSONObject();
		
		//JSON Parameters sending to server
		requestParams.put("name", "sanju 2");
		requestParams.put("salary", "100000");
		requestParams.put("age", "30");
		
		//JSON Header
		httprequest.header("Content-Type","application/json");
		
		//Request body parameters Posting
		httprequest.body(requestParams.toJSONString());
		
		
			
		//Response Object
		Response response=httprequest.request(Method.POST, "/create");
		
		//Print Response as String in Console
		String responseData=response.getBody().asString();
		System.out.println("Response Body is :"+responseData);
		
		//Status Code validation
		
		int statusCode=response.getStatusCode();
		System.out.println("Status Code :"+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//Success Message validation
		
		String successMsg=response.jsonPath().get("status");
		Assert.assertEquals(successMsg, "success");
		
		
	}


}
