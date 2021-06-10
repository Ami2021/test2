package Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	Alert alert ;
	WebDriverWait letswait;
	Select letsSelect;
	public void switchToAlert() {
	  alert = Driver.getDriver().switchTo().alert();
	}
	public String alertGetText() {
		alert = Driver.getDriver().switchTo().alert();
		  return alert.getText();
		}
	public void alertAccept() {
		alert = Driver.getDriver().switchTo().alert();
		 alert.accept();
		}
	public void waitUntilAlertIsPresent() {
		letswait = new WebDriverWait(Driver.getDriver(), 10);
		letswait.until(ExpectedConditions.alertIsPresent());
	}
	public void selectByVisibleText(WebElement element, String optionToSelect) {
	letsSelect = new Select(element);
	letsSelect.selectByVisibleText(optionToSelect);
		
	}
	public void waitUntilElementVisible(WebElement element) {
		letswait = new WebDriverWait(Driver.getDriver(), 10);
		letswait.until(ExpectedConditions.visibilityOf(element));
	}

}
