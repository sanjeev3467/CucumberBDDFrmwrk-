package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	private By dashboardbuttonlist=By.xpath("/html/body/app-root/app-app-layout/app-dashborad/div/div[2]/div[1]/div[2]/div/button");
	private WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
		
		this.driver=driver;		
		
	}
	
		
	public ArrayList<String> getDashBoardListValues() {
		
		ArrayList<String> arlist=new ArrayList<String>();
		
		List<WebElement> listval=driver.findElements(dashboardbuttonlist);
		
		for(WebElement e:listval) {
			
			String e1=e.getText();
			
			arlist.add(e1);
			
		}
		
		return arlist;
	}
	
	
	

}
