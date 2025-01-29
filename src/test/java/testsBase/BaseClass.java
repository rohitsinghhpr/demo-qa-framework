package testsBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initializeDriver() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Add implicit wait
	    driver.manage().window().maximize();
	    tdriver.set(driver);
	    return BaseClass.getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	
	@BeforeClass
	public void setUp() {
	    initializeDriver();
	    BaseClass.getDriver().get("https://demoqa.com/");
	}

	@AfterClass
	public void tearDown() {
	    if (BaseClass.getDriver() != null) {
	        BaseClass.getDriver().quit();
	    }
	}
}
