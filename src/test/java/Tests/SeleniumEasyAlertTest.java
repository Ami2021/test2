package Tests;

import org.testng.annotations.Test;

import Pages.SeleniumEasyAlertPage;

import Utilities.BrowserUtils;
import Utilities.Driver;
import Utilities.PropertiesReader;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SeleniumEasyAlertTest{
	SeleniumEasyAlertPage alertPage = new SeleniumEasyAlertPage();
	BrowserUtils utils = new BrowserUtils();
  @Test
  public void firstAlertTest() throws InterruptedException {
	  Driver.getDriver().get(PropertiesReader.getProperty("seleniumEasyAlertUrl"));
	  alertPage.firstAlertBtn.click();
	  // calling the swithToAlert function
	  utils.switchToAlert();
	  utils.waitUntilAlertIsPresent();
	  String expectedMessage = "I am an alert box!";
	  String actualMessage = utils.alertGetText();
	  Assert.assertEquals(actualMessage, expectedMessage);
	  Thread.sleep(3000);
	  utils.alertAccept();
	   }
  
  @Test
  
  @BeforeMethod
  public void beforeMethod() {
	  Driver.getDriver();
	  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  @AfterMethod
  public void afterMethod() {
	  Driver.quitDriver();
  }
	
	
}
 