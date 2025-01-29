package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SideBar;
import pageObjects.elements.RadioBox;
import testsBase.BaseClass;

public class RadioBoxTest extends BaseClass {

	@Test(priority = 1)
	public void TC002() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnElements();
		SideBar sideBar = new SideBar(driver);
		sideBar.clickOnRadioBox();
		RadioBox radioBoxPage = new RadioBox(driver);
		radioBoxPage.clickOnYes();
		radioBoxPage.clickOnImpressive();
	}
}
