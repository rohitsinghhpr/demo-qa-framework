package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilies.BrowserUtils;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//h5[text()=\"Elements\"]")
	WebElement elementsLink;
	
	@FindBy(xpath="//h5[text()=\"Elements\"]")
	WebElement fromsLink;
	
	@FindBy(xpath="//h5[text()=\"Elements\"]")
	WebElement alertsLink;
	
	@FindBy(xpath="//h5[text()=\"Elements\"]")
	WebElement widgetsLink;
	
	@FindBy(xpath="//h5[text()=\"Elements\"]")
	WebElement interactionsLink;
	
	public void clickOnElements() {
		BrowserUtils.scrollPage(driver,500);
		elementsLink.click();
	}
	public void clickOnForms() {
		fromsLink.click();
	}
	public void clickOnAlerts() {
		alertsLink.click();
	}
	public void clickOnWidgets() {
		widgetsLink.click();
	}
	public void clickOnInteractionsLink() {
		interactionsLink.click();
	} 
}
