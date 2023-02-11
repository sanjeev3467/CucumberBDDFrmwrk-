package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.LoginPage;
import com.pages.Region;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regionSteps {
	
	LoginPage logins=new LoginPage(DriverFactory.getDriver());
	Region regn=new Region(DriverFactory.getDriver());
	ExcelReader er=new ExcelReader();
	
	@Given("Click on Facility link")
	public void click_on_facility_link() throws InterruptedException {
     
		DriverFactory.getDriver().get("https://testing2.riskwatch.com/platform/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logins.doLogin("sanjeevaiah.sompalli@info-sun.com","Info-123");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		regn.facilityLink();
       
	}

	@When("Click on Region Link")
	public void click_on_region_link() {

		regn.regionLink();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@When("Click on Add New button")
	public void click_on_add_new_button() {

		regn.addRegion();

	}

	@Then("Enter Region Name in Sheet {string} Row {string}")
	public void enter_region_name(String SheetName, String rowNo) throws InvalidFormatException, IOException, InterruptedException {
	
		
		int rowno1=Integer.parseInt(rowNo);
		List<Map<String, String>> MappData=er.getData("E:\\Automation\\CucumberHybridBDDProject\\TestData.xlsx",SheetName);
		
		String regionNames=MappData.get(rowno1).get("RegionNames");
		System.out.println("Row number is:::"+rowno1);
		System.out.println("region names is:::"+regionNames);
		regn.enterRegion(regionNames);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("region names entered:::"+regionNames);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Click on Save button")
	public void click_on_save_button() {
		
		regn.clickSave();

	}

}
