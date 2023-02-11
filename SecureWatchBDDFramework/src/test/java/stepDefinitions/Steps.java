package stepDefinitions;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPageObjects;
import pageObjects.RegionPageObjects;
import utilities.BaseClass;

public class Steps {
	
	public WebDriver driver;
	public LoginPageObjects loginpage;
	public Logger logger;
	public RegionPageObjects regionpage;
	public BaseClass bc;
	
 @Given("Launch Browser")
 public void launch_browser() {
	 
	 logger=Logger.getLogger("SecureWatchBDDFramework");
	 PropertyConfigurator.configure("logs/log4j.properties");

	 	 
	 System.setProperty("webdriver.edge.driver","E://Automation//SecureWatchBDDFramework//Drivers//msedgedriver.exe");
	 
	 driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 	  
	 logger.info("****************** Edge Browser Launched Successfully *********************");
 }
	
 @When("Enter Secure Watch URL as {string}")
 public void enter_secure_watch_url_as(String urlval) throws InterruptedException {
	 
	 driver.get(urlval);
	 
	 Thread.sleep(3000);
	 
	 logger.info("******************** Secure Watch URL Launched Successfully ********************");
	 
 }

 @Then("Secure Watch Login page Title Confirmation as {string}")
 public void secure_watch_login_page_title_confirmation(String title1) {
	 	  
	 System.out.println("Login Page Title is ...."+driver.getTitle());
	 
	 if(driver.getTitle().contentEquals(title1)) {
			
			Assert.assertTrue(true);
			
			logger.info("***************** Login Page Title Matched ****************"+driver.getTitle());
									
		} else {
										
			logger.info("***************** Login Page Title not Matched ****************"+driver.getTitle());
			
			driver.close();
			Assert.assertTrue(false);
			
		}
}
 
 @When("Enter User Name as {string} and Passowrd as {string}")
 public void enter_user_name_as_and_passowrd_as(String uname1, String pwd1) {

	 logger.info("***************** Entering Login Credentails ****************");
	 loginpage=new LoginPageObjects(driver);
	 loginpage.Enter_UserName(uname1);
	 loginpage.Enter_Password(pwd1);
	 
	 logger.info("***************** Login Credentials entered ****************");
 }

 @Then("Click on Login button")
 public void click_on_login_button() throws InterruptedException {
    
	 loginpage.Click_on_Loginbutton();
	 
	 logger.info("***************** Login button Clicked ****************");
 }

 @And("Dashboard Title Confirmation as {string}")
 public void dashboard_title_confirmation(String title1) {
    
	 if(driver.getPageSource().contains("Invalid Credentials") || driver.getPageSource().contains("You haven't created your password Yet. Please contact your administrator.") || driver.getPageSource().contains("Incorrect email, please check") ) {
			
		 logger.info("***************** Browser Closed due to Dashboard Page title not matched ****************");
			
		 driver.close();
			
		 Assert.assertTrue(false);
				
									
		} else if(driver.getTitle().equalsIgnoreCase("SecureWatch | ERM")){
			
			logger.info("***************** Dashboard Page Title Matched ****************"+driver.getTitle());
			
			System.out.println("Dashboard Ttile is ...."+driver.getTitle());
			
		//	Assert.assertEquals("SecureWatch | ERM",driver.getTitle());
			
			
			
		
			
			
		} else if(driver.getTitle().contentEquals(title1)) {
			
            logger.info("***************** Dashboard Page Title Matched ****************"+driver.getTitle());
			
			System.out.println("Dashboard Title is ...."+driver.getTitle());
			
		//	Assert.assertEquals(title1,driver.getTitle());
		} else {
			
			logger.info("***************** Dashboard Page Title not Matched ****************"+driver.getTitle());
			
			driver.close();
			
			Assert.assertTrue(false);
			
			
		}
	 }
 
 @And("Close Browser")
 public void Close_Browser() throws InterruptedException {
	 
	 Thread.sleep(3000);
	 driver.quit();
	 
	 logger.info("***************** Browser Closed ****************");
 }

 /* Region Steps */
 
 @When("Click on Menu icon")
 public void click_on_menu_icon() {
 
	 logger.info("***************** Click on Menu icon ****************");
	 regionpage=new RegionPageObjects(driver);
	 regionpage.click_MenuIcon();
	 

 }

 @Then("Click on Facility Module")
 public void click_on_facility_module() {

	 logger.info("***************** Click on Facility Module ****************");
	 regionpage.click_FacilityMenu();

 }

 @When("Click on Region Link")
 public void click_on_region_link() {

	 logger.info("***************** Click on Region Link ****************");
	 regionpage.click_RegionLink();
	 
 }

 @Then("Click on Add Region button")
 public void click_on_add_region_button() {
     
	 regionpage.click_NewRegionbutton();
	 logger.info("***************** Add Region Page should be Open ****************");
		
 }
 
 @Then("Region Title Confirmation as {string}")
 public void region_title_confirmation_as(String rtitle1) {
    
	 if(regionpage.get_RegionTitle().contentEquals(rtitle1)) {
		 
		 Assert.assertTrue(true);
		 
		 logger.info("***************** Add Region Page Opened and Title Matched ****************"+regionpage.get_RegionTitle());
		 
	 } else {
		 
		 logger.info("***************** Add Region Title not matched ****************"+regionpage.get_RegionTitle());
		 
		 driver.close();
		 
		 Assert.assertTrue(false);
		 	 	 
		 
	 }
	 
 }

 @When("Enter Region Name as {string} and Region Description as {string}")
 public void enter_region_name_as_and_region_description_as(String RegName, String RegDesc) {
    
	 
	 regionpage.set_RegionName(RegName);
	 regionpage.set_RegionDesc(RegDesc);
	 
	 logger.info("****** Region Name, Description Entered ******** "+RegName+"-----"+RegDesc+"");
	 
 }

 @Then("Click on Save button")
 public void click_on_save_button() {
     
	 logger.info("****** Click on Region Save button ********");
	 regionpage.Click_RegionSavebtn();
	 
 }
 
 @And("Region Saved Success Message Confirmation as {string}")
 public void region_Success_Message(String rSucMsg) {
	
	 if(regionpage.get_RegionSuccessMessage().contentEquals(rSucMsg)){
		 
		 logger.info("****** Region Success Message matched ******** "+regionpage.get_RegionSuccessMessage());
		 Assert.assertTrue(true);
	 } else {
		 
		 logger.info("****** Region Success Message not matched ******** "+regionpage.get_RegionSuccessMessage());
		 
		 driver.close();
		 Assert.assertTrue(false);
	 }
	 
 }
 
 
 @When("Enter Region Name in Search")
 public void enter_region_name_in_search() {
	 
	 
	 
	  regionpage.set_RegionName_Search(regionpage.get_RegionName());
	  logger.info("****** Searching Region Name entering ******** "+regionpage.get_RegionName());
		 
	 
 }

 @Then("Searched Region Name Confirmation")
 public void searched_region_name_confirmation() {

	 regionpage.get_Region_Table(regionpage.get_RegionName());
	 logger.info("****** Searched Region Name Matched ******** "+regionpage.get_RegionName());
 
 }
 
 @And("Click on Delete icon")
 public void delete_Region() {
	 
	 regionpage.click_regDeleteIcon();
	 logger.info("****** Clicked on Region delete icon ******** ");
 }
 
 @When("Delete Region Confirmation Yes")
 public void regrion_delte_dailog_Yes() throws InterruptedException, AWTException{
	 
	 regionpage.click_DeleteYes();
	 
	 
		logger.info("****** Accept Alert ******** ");
	 
	 
 }
 
 @Then("Region delete Success message as {string}")
 public void delete_region_Confirmsg(String delmsg) {
	 
	 if(regionpage.get_Delete_Cofirm_msg().contentEquals(delmsg)) {
		 
		 logger.info("****** Region Deleted Message Matched ******** "+regionpage.get_Delete_Cofirm_msg());
		 Assert.assertTrue(true);
		 
		 driver.close();
		 
	 } else {
		 
		 logger.info("****** Region Deleted Message not Matched ******** "+regionpage.get_Delete_Cofirm_msg());
		 Assert.assertTrue(false);
		 driver.close();
	 }
	 
 }
 
 @When("Click on region Edit icon")
 public void Click_region_EditIcon() throws InterruptedException {
	 
	 regionpage.click_RegionEditIcon();
	 Thread.sleep(5000);
	 logger.info("****** Region Record edit icon clicked ******** ");
	 
 }
 
 @Then("Enter update Region Name as {string} and update Region desc as {string}")
 public void Update_Region_Details(String regNameupdat1,String regDescupdate1) {
	 
	 regionpage.set_update_RegionName(regNameupdat1);
	 regionpage.set_update_RegionDesc(regDescupdate1);
	 
	 logger.info("****** Region details updated ******** "+regNameupdat1+"--------"+regDescupdate1+"");
 }
 
 @And("Click on Save button for update")
 public void Click_savebutton_forUpdate() {
	 
	 regionpage.click_Save_RegionUpdate();
	 logger.info("****** Save button clicked for Region Update ******** ");
 }
 
 @Then("Region update Success message as {string}")
 public void update_Success_msg(String updatesucmsg) {
	 
	 	 
	 if(regionpage.get_update_message_Confirm().contentEquals(updatesucmsg)) {
		 
		 logger.info("****** Region Updated success message matched ******** "+regionpage.get_update_message_Confirm());
		 Assert.assertTrue(true);
		 
		 driver.close();
		 
	 } else {
		 
		 logger.info("****** Region Updated success message not matched ******** "+regionpage.get_update_message_Confirm());
			
		 
		 driver.close();
		 Assert.assertTrue(false);
	 }
	 
 }
 
 @And("Region Duplicate Message Confirmation as {string}")
 public void New_Region_Duplicate_msg_Confirm(String nDupMsg) {
	 
	 if(nDupMsg.contentEquals(regionpage.confirm_new_Region_Duplicate())) {
		 
		 logger.info("****** New Region Duplicate message matched ******** "+regionpage.confirm_new_Region_Duplicate());
			
			
			driver.close();
			
			Assert.assertTrue(true);
			
		} else {
			
			logger.info("****** New Region Duplicate message not matched ******** "+regionpage.confirm_new_Region_Duplicate());
							
			driver.close();
			
			Assert.assertTrue(false);
		}
	 
	 
 }
 
 	

}
