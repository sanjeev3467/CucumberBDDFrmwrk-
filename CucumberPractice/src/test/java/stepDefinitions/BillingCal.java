package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingCal {
	
	double billAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("Landing to Billing details")
	public void landing_to_billing_details() {

	}

	@When("Enter Billing Billing amount {string}")
	public void enter_billing_billing_amount(String billAmount) {
		this.billAmount=Double.parseDouble(billAmount);


	}

	@When("Enter Tax Amount {string}")
	public void enter_tax_amount(String taxAmount) {
		this.taxAmount=Double.parseDouble(taxAmount);

	}

	@Then("Click on Calculate button")
	public void click_on_calculate_button() {

	}

	@Then("Final Amount information {string}")
	public void final_amount_information(String finalAmount) {
		
	this.finalAmount=this.billAmount+this.taxAmount;
	
	System.out.println("Expected final amount is: "+finalAmount);
	System.out.println("Actual Final Amount is: "+this.finalAmount);
	
	if(this.finalAmount==Double.parseDouble(finalAmount)) {
		
		System.out.println("Amount matched");
		
	} else {
		
		System.out.println("Amount not matched");
	}


	}


}
