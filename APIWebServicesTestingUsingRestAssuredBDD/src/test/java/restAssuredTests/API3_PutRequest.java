package restAssuredTests;

import java.util.HashMap;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.matcher.RestAssuredMatchers;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidator.*;
import org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class API3_PutRequest {
	
	public static HashMap map=new HashMap();
	
	String ename=RestUtils.getempName();
	String design=RestUtils.getempDesig();
	
	@BeforeClass
	public void PutData() {
		
		map.put("name",ename);
		map.put("job", design);
		
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RestAssured.basePath="/{ISBN}";
		
	}
	
	@Test
	public void testPut() {
		
		given()
		.header("content-type","application/json; charset=utf-8")
		.when()
		.put()
		.then()
		.assertThat().body("code", Matchers.notNullValue());
		
		
	}

}
