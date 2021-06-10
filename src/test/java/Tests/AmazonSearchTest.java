package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AmazonHomePage;
import Utilities.BrowserUtils;
import Utilities.Driver;
import Utilities.PropertiesReader;

public class AmazonSearchTest{
		
		BrowserUtils utils = new BrowserUtils();
		AmazonHomePage amazonHP = new AmazonHomePage();
		
	 @Test
	 public void amazonSearchTest() throws InterruptedException {
		 Driver.getDriver().get(PropertiesReader.getProperty("amazonURL"));
		 amazonHP.searchBox.sendKeys("coffee mug");
		 amazonHP.searchButton.click();
		 Thread.sleep(4000);
	 }
	 @Test
	 public void dropDownTest() {
		 
		 
	 }
	 @BeforeMethod
	 public void beforeMethod() {
		 Driver.getDriver();
	 }
	 @AfterMethod
	 public void afterMethod() {
		 Driver.quitDriver();
	 }
	}
