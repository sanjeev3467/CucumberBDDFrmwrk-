package stepDefinitions;

import org.junit.Assert;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private static String Title;
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("https://testing2.riskwatch.com/platform/login");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_login_page() {

		Title=loginpage.getTitleOfPage();
		System.out.println("Actual Login page title is: "+Title);
		
	}

	@Then("Login page title should be {string}")
	public void login_page_title_should_be(String ExpectedLoginpgTitle) {

		System.out.println("Expected Login page title is: "+ExpectedLoginpgTitle);
       Assert.assertTrue(Title.contains(ExpectedLoginpgTitle));
 
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {

      Assert.assertTrue(loginpage.forgotPwdlinkexist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName1) {

       loginpage.setUserName(userName1);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password1) {

       loginpage.setPassword(password1);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {

       loginpage.clickLoginButton();
       try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("home page title should be {string}")
	public void home_page_title_should_be(String ExpectedHomeTitle) {

        Assert.assertTrue(Title.contains(ExpectedHomeTitle));
	}
	
	

}
