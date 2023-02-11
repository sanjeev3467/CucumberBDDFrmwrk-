package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
import utilities.waitOperation;

public class RegionPageObjects {
	
	public WebDriver driver;
	public waitOperation waithelp;
	public BaseClass bc;
	public static String rgName1="";
	public static String rgDesc1="";
	
	By menuIcon=By.xpath("//mat-icon[contains(text(),'menu')]");
	By facilityMenu=By.xpath("/html/body/app-root/app-app-layout/small-screen-menu/div/mat-sidenav-container/mat-sidenav/div/ng-material-multilevel-menu/div/mat-list/ng-list-item[8]/mat-list-item/div/a/div[1]/span");
	By regionLink=By.xpath("//span[contains(text(),'Region(s)')]");
	By newRegionbtn=By.xpath("//button[contains(text(),'Add Region')]");
	By regionName=By.id("mat-input-6");
	By regionDesc=By.id("mat-input-7");
	By regionSave=By.xpath("//span[contains(text(),'Save')]");
	By regionTitle=By.xpath("//h4[contains(text(),'Add Region')]");
	By regionSuccessmsg=By.xpath("//div[@aria-label=\"Region Saved Successfully\"]");
	By regionSearch=By.id("mat-input-2");
	By rowln=By.xpath("//*[@id=\"cdk-drop-list-0\"]/mat-row/mat-cell[2]/div/span[1]");
	By regDelete=By.xpath("//mat-icon[contains(text(),'delete')]");
	By regDelConf=By.xpath("//div[@aria-label=\"Region has been deleted.\"]");
	By deleteYes=By.xpath("//span[contains(text(),'Yes')]");
	By editIcon=By.xpath("//mat-icon[contains(text(),'create')]");
	By updateSucmsg=By.xpath("//div[contains(text(),'Region Updated Successfully')]");
	By nRegDupMsgpath=By.xpath("//div[contains(text(),'Duplicate Region Name')]");
	
	
	public RegionPageObjects(WebDriver sdriver) {
		
		driver=sdriver;
		
		PageFactory.initElements(sdriver, this);
	}
	
	public void click_MenuIcon() {
		
		waithelp=new waitOperation(driver);
		waithelp.waithelper(menuIcon, 20);
		
		driver.findElement(menuIcon).click();
	}
	
	public void click_FacilityMenu() {
		
		waithelp.waithelper(facilityMenu, 3);
		
		driver.findElement(facilityMenu).click();
	}
	
	public void click_RegionLink() {
		
		waithelp.waithelper(regionLink, 3);
		driver.findElement(regionLink).click();
		
	}
			
	public void click_NewRegionbutton() {
		
		waithelp.waithelper(newRegionbtn, 15);
		driver.findElement(newRegionbtn).click();
	}

    public String get_RegionTitle() {
		
		waithelp.waithelper(regionTitle, 3);
		String regionTitl=driver.findElement(regionTitle).getText();
		
		return regionTitl;
	}

	public String set_RegionName(String rName) {
		
		driver.findElement(regionName).sendKeys(rName);
		
		rgName1=rName;
		
		return rName;
	}
	
	public String get_RegionName() {
				
		String rgName=rgName1;
		
		
		return rgName;
	} 
	
	public void set_RegionDesc(String rDesc) {
		
		driver.findElement(regionDesc).sendKeys(rDesc);
		
		
	}
	
		
	public void Click_RegionSavebtn() {
		
		waithelp.waithelper(regionSave, 20);
		driver.findElement(regionSave).click();
		
	}
	
	public String get_RegionSuccessMessage() {
		
		waithelp.waithelper(regionSuccessmsg, 10);
		
		String regSucMsg=driver.findElement(regionSuccessmsg).getText();
		
		return regSucMsg;
	}
	
	public void set_RegionName_Search(String regSearch) {
		
		waithelp.waithelper(regionSearch, 10);
		
		driver.findElement(regionSearch).sendKeys(regSearch);
	}
	
	
		
	public void get_Region_Table(String regSearch) {
		
		
		waithelp.waithelper(rowln, 20);
		
		int rowLeng=driver.findElements(rowln).size();
		
		for(int i=1;i<=rowLeng;i++) {
			
			System.out.println("Rown Num is..."+i);
						
			String regSearchName=driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-0\"]/mat-row["+i+"]/mat-cell[2]/div/span[1]")).getText();
		
		if(regSearch.contentEquals(regSearchName)) {
			
			System.out.println("Region Name Matched"+regSearchName);
		}
				
		}
	}
	
	public void click_regDeleteIcon() {
		
			
		driver.findElement(regDelete).click();
						
	}
	
	public void click_DeleteYes() throws InterruptedException, AWTException {
		

		 bc=new BaseClass(driver);
		 
		 waithelp.waithelper(deleteYes, 15);
		bc.actions(deleteYes);
		 
	}
	
	public String get_Delete_Cofirm_msg() {
		
		waithelp.waithelper(regDelConf, 15);
		String deleteRegConfMSG=driver.findElement(regDelConf).getText();
				
		return deleteRegConfMSG;
	}
	
	public void click_RegionEditIcon() {
		
		driver.findElement(editIcon).click();
		
	}
	
	public void set_update_RegionName(String updateregname1) {
		
		
		waithelp.waithelper(regionName, 15);
		driver.findElement(regionName).clear();
		waithelp.waithelper(regionName, 15);
		driver.findElement(regionName).sendKeys(updateregname1);
	}
	
	public void set_update_RegionDesc(String updateregdesc1) {
		
		driver.findElement(regionDesc).clear();
		
		waithelp.waithelper(regionDesc, 20);
		driver.findElement(regionDesc).sendKeys(updateregdesc1);
	}
	
	public void click_Save_RegionUpdate() {
		
		waithelp.waithelper(regionSave, 15);
		
		driver.findElement(regionSave).click();
		
	}
	
	public String get_update_message_Confirm() {
		
		waithelp.waithelper(updateSucmsg, 15);
		
		String updatemsg=driver.findElement(updateSucmsg).getText();
		
		return updatemsg;
	}
	
	public String confirm_new_Region_Duplicate() {
		
		waithelp.waithelper(nRegDupMsgpath, 15);
		
		String DuplicateMsg=driver.findElement(nRegDupMsgpath).getText();
		
		
		return DuplicateMsg;
		
		
	}
}
