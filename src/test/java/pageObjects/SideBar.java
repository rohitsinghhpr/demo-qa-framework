package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBar extends BasePage {

	public SideBar(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class=\"header-text\" and text()=\"Elements\"]")
	WebElement elemenst;
	
	@FindBy(xpath = "//span[text()=\"Text Box\" and @class=\"text\"]")
	WebElement textBox;
	
	@FindBy(xpath = "//span[text()=\"Radio Button\" and @class=\"text\"]")
	WebElement radioBox;
	
	public void clickOnElements() {
		elemenst.click();
	}
	
	public void clickOnTextBox() {
		textBox.click();
	}
	
	public void clickOnRadioBox() {
		radioBox.click();
	}

}
