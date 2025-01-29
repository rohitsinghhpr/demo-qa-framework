package pageObjects.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.BasePage;
import utilies.BrowserUtils;

public class TestBox extends BasePage{

	public TestBox(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//label[text()=\"Full Name\"]//parent::*//following-sibling::div//input")
	WebElement fullName;
	
	@FindBy(xpath="//label[text()=\"Email\"]//parent::*//following-sibling::div//input")
	WebElement email;
	
	@FindBy(xpath="//label[text()=\"Current Address\"]//parent::*//following-sibling::div//textarea")
	WebElement currentAddress;
	
	@FindBy(xpath="//label[text()=\"Permanent Address\"]//parent::*//following-sibling::div//textarea")
	WebElement permanentAddress;
	
	@FindBy(xpath="//button[text()=\"Submit\"]")
	WebElement submitButton;
	
	public void fillFullName(String value) {
		fullName.sendKeys(value);
	}
	
	public void fillEmail(String value) {
		email.sendKeys(value);
	}
	
	public void fillCurrentAddress(String value) {
		currentAddress.sendKeys(value);
	}
	
	public void fillPermanentAddress(String value) {
		permanentAddress.sendKeys(value);
	}
	
	public void clickOnSubmitButton() {
		BrowserUtils.scrollIntoView(driver, submitButton);
		submitButton.click();
	}

}
