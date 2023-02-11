package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Region {
	
	private WebDriver driver;
	
	private By menu=By.xpath("/html/body/app-root/app-app-layout/small-screen-menu/div/mat-toolbar/button[1]/span/mat-icon");
	private By FacilityLink=By.xpath("/html/body/app-root/app-app-layout/small-screen-menu/div/mat-sidenav-container/mat-sidenav/div/ng-material-multilevel-menu/div/mat-list/ng-list-item[9]/mat-list-item/div/a/div[1]/span");
	private By RegionLink=By.xpath("/html/body/app-root/app-app-layout/small-screen-menu/div/mat-sidenav-container/mat-sidenav/div/ng-material-multilevel-menu/div/mat-list/ng-list-item[9]/div/ng-list-item[3]/mat-list-item/div/a/div/span");
    private By AddRegion=By.xpath("//*[@id=\"user-details\"]/div[1]/div[2]/button[1]");
    private By RegionName=By.xpath("/html/body/app-root/app-app-layout/app-facilityregion/div/div/div/section/div/div/div[2]/div/div/form/div/div[1]/div[1]/mat-form-field/div/div[1]/div/input");
    private By RegionSave=By.xpath("/html/body/app-root/app-app-layout/app-facilityregion/div/div/div/section/div/div/div[2]/div/div/form/div/div[2]/div/button[2]/span");
	
	public Region(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void facilityLink() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.findElement(menu).click();
		Thread.sleep(10000);
		driver.findElement(FacilityLink).click();
		
	}
	
	public void regionLink() {
		
		driver.findElement(RegionLink).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addRegion() {
		
		driver.findElement(AddRegion).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
    public void enterRegion(String regionName) throws InterruptedException {
    	
    	Thread.sleep(5000);
		
		driver.findElement(RegionName).sendKeys(regionName);
	}
	
    public void clickSave() {
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(RegionSave).click();
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    
}
