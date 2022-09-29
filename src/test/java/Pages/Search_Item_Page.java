package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import helperMethods.WaitTypes;
//import helperMethods.WaitTypes;

public class Search_Item_Page extends BaseClass {
	// private WebDriver driver;
	//WebDriver driver = BaseClass.getDriver();
	WaitTypes wait;

//	static private final By EnterItemName = By.xpath("//input[@name='q']");
//	static private final By SearchIcon = By.xpath("//button[@type='submit']");

	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement EnterItemName;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SearchIcon;

	public Search_Item_Page() {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitTypes(driver);
	}

	public void enter_Item_Name() {
	wait.waitforElementToBeDisplayed(EnterItemName, 20);

		System.out.println("Element found");

//		 EnterItemName.sendKeys(JsonUtils.getData(DefineConstants.Search_Item_Step,
//		 "ItemName"));

		EnterItemName.sendKeys("oneplus");
		System.out.println("Enter Item Name");
	}

	public void click_Search_Icon() {
//		wait.waitforElementToBeDisplayed(EnterItemName, 20);
		EnterItemName.click();
		System.out.println("Click on Search Icon");
	}

}
