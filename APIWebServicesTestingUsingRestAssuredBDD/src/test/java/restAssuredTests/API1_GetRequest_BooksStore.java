package restAssuredTests;
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

public class API1_GetRequest_BooksStore {
	
	@Test
	public void getBooksDetails() {
		
		given().
		when().
		       get("https://demoqa.com/BookStore/v1/Books/").
		then().
		       header("Content-Type","application/json; charset=utf-8").
		       assertThat().body("books.title", Matchers.hasItems("Git Pocket Guide",
		    		   "Learning JavaScript Design Patterns","Designing Evolvable Web APIs with ASP.NET",
		    		   "Speaking JavaScript","You Don't Know JS","Programming JavaScript Applications",
		    		   "Eloquent JavaScript, Second Edition","Understanding ECMAScript 6"));
		
	}

	
	

}