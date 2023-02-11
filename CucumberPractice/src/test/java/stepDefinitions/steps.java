package stepDefinitions;

import amazonImplimentation.Product;
import amazonImplimentation.Searching;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps {
	
	Product product;
	
	
	@Given("Search field available in amazon")
	public void search_field_available_in_amazon() {

		System.out.println("Step 1");
		
	}

	@When("Search amazon product {string} price {int}")
	public void search_amazon_product_price(String productName, Integer price) {

     System.out.println("Step 2  "+productName+" price:"+price);
	
     product=new Product(productName,price);
     
	}

	@Then("Display Product details {string}")
	public void display_product_details(String productName) {

		System.out.println("Step 3");
		
		Searching search=new Searching();
		
		String name=search.DisplayProducts(product);
		
		System.out.println("Product Name :  "+name);
		
		Assert.assertEquals(productName, name);
		
	}

}
