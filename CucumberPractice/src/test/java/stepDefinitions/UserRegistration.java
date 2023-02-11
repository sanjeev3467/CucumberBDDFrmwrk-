package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	@Given("Navigate to User Region Page")
	public void navigate_to_user_region_page() {

		System.out.println("Navigate to Registration Page");
	}

	@When("Enter user details as follows")
	public void enter_user_details_as_follows(DataTable dataTable) {
	    	    
		List<List<String>> users=dataTable.asLists(String.class);
		
		for(List<String> L1:users) {
			
			System.out.println("Users list is : "+L1);
		}
	}


@When("Enter user details as follows mapping data")
public void enter_user_details_as_follows_mapping_data(DataTable dataTable) {
	
	List<Map<String, String>> mapdata=dataTable.asMaps(String.class, String.class);
	System.out.println("Map users data "+mapdata.get(0).get("FirstName"));
	
	for(Map<String,String> e:mapdata) {
		
		System.out.println("Mapped users data here: "+e.get("FirstName"));
		System.out.println("Mapped users data here: "+e.get("LastName"));
		System.out.println("Mapped users data here: "+e.get("EMail"));
		System.out.println("Mapped users data here: "+e.get("Phone"));
		System.out.println("Mapped users data here: "+e.get("Location"));
		
	}
    
}

	@Then("User Registration is Successfull")
	public void user_registration_is_successfull() {

		System.out.println("Registration Successful");
	}

}
