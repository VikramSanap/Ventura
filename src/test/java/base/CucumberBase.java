package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.DefineConstants;
import cucumber.api.java.Before;
import helperMethods.JsonUtils;

public class CucumberBase {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {

		Thread.sleep(1000);
		if (DefineConstants.browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",DefineConstants.ChromeDriver); 
			ChromeOptions options = new ChromeOptions();

			options.addArguments("--start-maximized");
			options.addArguments("window-size=1280,1024");

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(JsonUtils.getData(DefineConstants.Search_Item_Step, "URL"));
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (DefineConstants.browser.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver",DefineConstants.FirefoxDriver); 

			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(JsonUtils.getData(DefineConstants.Search_Item_Step, "URL"));
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (DefineConstants.browser.equalsIgnoreCase("internetexplorer")) {

			System.setProperty("webdriver.ie.driver",DefineConstants.IEDriver); 
			driver.manage().window().maximize();
			driver.get(JsonUtils.getData(DefineConstants.Search_Item_Step, "URL"));
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}


	}
	public WebDriver getDriver() {
		return driver;
	}



	public void tearDown() throws IOException {

		driver.quit();
	}
}
