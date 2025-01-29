package pageObjects.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.BasePage;
import utilies.BrowserUtils;

public class RadioBox extends BasePage{

	public RadioBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//label[text()=\"Yes\"]")
	WebElement yes;
	
	@FindBy(xpath = "//label[text()=\"Impressive\"]")
	WebElement impressive;
	
	@FindBy(xpath="//label[text()=\"No\"]")
	WebElement no;
	
	public void clickOnYes() {
		BrowserUtils.scrollIntoView(driver, yes);
		yes.click();
	}
	
	public void clickOnImpressive() {
		BrowserUtils.scrollIntoView(driver, impressive);
		impressive.click();
	}

}
