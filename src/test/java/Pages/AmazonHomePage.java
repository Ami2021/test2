package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class AmazonHomePage {
	
		
		public AmazonHomePage() { //this is the constructors
			PageFactory.initElements(Driver.getDriver(), this); //PageFactory is a factory class
			}
		@FindBy(id = "twotabsearchtextbox")
		public WebElement searchBox;
		
		@FindBy(id = "nav-search-submit-button")
		public WebElement searchButton;
		
		@FindBy(xpath = "//a[text()='Sign in security']")
		public WebElement signInButton;
		@FindBy (xpath="//div[@data-component-type='s-search-result']//span[@class='a-price-whole']")
		public List<WebElement> searchItemPrices;
		
		
		@FindBy (xpath="//span[@class='a-color-state a-text-bold']")
		public WebElement searchResultText;
	
	
	}

	
	


