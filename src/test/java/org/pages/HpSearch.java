package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HpSearch extends LibGlobal{
	@Test
	@Parameters({"browser","searchkey"})
	private void browserLaunch(String s,String s1) {
		
		if (s.equalsIgnoreCase("chrome")) {
			browserLaunchChrome();
			maxWindows();
			enterUrl("https://www.amazon.in/ref=nav_logo");
			WebElement txtSearch = fid("twotabsearchtextbox");
			sendValue(txtSearch, s1);
			txtSearch.sendKeys(Keys.ENTER);
		
		} else if (s.equalsIgnoreCase("firefox")) {
			browserLaunchFirefox();
			maxWindows();
			enterUrl("https://www.amazon.in/ref=nav_logo");
			WebElement txtSearch = fid("twotabsearchtextbox");
			sendValue(txtSearch, s1);
			txtSearch.sendKeys(Keys.ENTER);
		
		}
		
		else if (s.equalsIgnoreCase("edge")) {
			
			browserLaunchEdge();
			maxWindows();
			enterUrl("https://www.amazon.in/ref=nav_logo");
			WebElement txtSearch = fid("twotabsearchtextbox");
			sendValue(txtSearch, s1);
			txtSearch.sendKeys(Keys.ENTER);			
		}
		else {
			displ("No Browser !!!");
		}

		
	}
	
	
	

}
