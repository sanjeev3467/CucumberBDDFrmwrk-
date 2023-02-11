package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardSteps {
	
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private DashboardPage dp=new DashboardPage(DriverFactory.getDriver());
	
	@Given("user should be login")
	public void user_should_be_login(DataTable dataTable) {
		
		List<Map<String, String>> st2=dataTable.asMaps(String.class, String.class);
			
		for(Map<String,String> e1:st2) {
			
			String user1=e1.get("uName");
			String pwd1=e1.get("passWord1");
			
		System.out.println("User Credentials: User Nmae:  "+user1+"  password: "+pwd1);
			
		DriverFactory.getDriver().get("https://testing2.riskwatch.com/platform/login");
				
		System.out.println("Url Launched");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginpage.doLogin(user1, pwd1);
				
		}
	}

	@Given("Dashboard button navigation names")
	public void dashboard_button_navigation_names(DataTable dataTable1) {
		
		List<List<String>> exp1=dataTable1.asLists(String.class);
		
		for(List<String> er: exp1) {
			
			
			System.out.println("Dashboard Button Names: "+er);
			
			if(dp.getDashBoardListValues().contains(er)) {
				
				System.out.println("values matched");
			}
						
		}
		
	}

	@Then("Dashboard button count matching")
	public void dashboard_button_count_matching() {

	}

}
