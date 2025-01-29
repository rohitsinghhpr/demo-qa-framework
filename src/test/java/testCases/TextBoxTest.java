package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SideBar;
import pageObjects.elements.TestBox;
import testsBase.BaseClass;

public class TextBoxTest extends BaseClass{
	@Test(priority=1)
	public void TC001() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnElements();
		SideBar sideBar = new SideBar(driver);
		sideBar.clickOnTextBox();
		TestBox textBoxPage = new TestBox(driver);
		textBoxPage.fillFullName("Rohit");
		textBoxPage.fillEmail("rs907582@gmail.com");
		textBoxPage.fillCurrentAddress("xyz");
		textBoxPage.fillPermanentAddress("demo app address");
		textBoxPage.clickOnSubmitButton();
	}
}
