package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("Uber wants to select a Car Type {string} from uber app")
	public void uber_wants_to_select_a_car_type_from_uber_app(String carType) {
		
		System.out.println("Step 1 : Car Type: "+carType);
	   
	}

	@When("user selects car {string} and pickup point {string} and drop location {string}")
	public void user_selects_car_and_pickup_point_and_drop_location(String carType, String pickupLoc, String dropLoc) {
	    
		System.out.println("Step 2 :Car Type: "+carType+" pickup: "+pickupLoc+"  dropLoctn: "+dropLoc);
	}

	@Then("Driver Starts Journey")
	public void driver_starts_journey() {
		
		System.out.println("Step 3");
	   
	}

	@Then("Driver ends journey")
	public void driver_ends_journey() {
		
		System.out.println("Step 4");
	   
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5: "+price);
	}

}
