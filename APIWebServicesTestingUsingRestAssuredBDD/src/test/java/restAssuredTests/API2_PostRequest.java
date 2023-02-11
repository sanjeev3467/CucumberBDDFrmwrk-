package restAssuredTests;

import java.util.HashMap;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.matcher.RestAssuredMatchers;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.parsing.Parser;

import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class API2_PostRequest {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void setupParameters() {
		
		map.put("name",RestUtils.getempName());
		map.put("job",RestUtils.getempDesig());
		
		RestAssured.baseURI="http://reqres.in/api";
		RestAssured.basePath="/users";
		RestAssured.defaultParser = Parser.JSON;
	}
	
	@Test
	public void testPost() {
		
		given().
		contentType("application/json; charset=utf-8").
		body(map).
		
		when().
		post().
		
		then().
		assertThat().
		body("createdAt",Matchers.notNullValue()).
		and().
		body("id",Matchers.notNullValue());
		
	}

}
