package step_definations;

import org.openqa.selenium.WebDriver;

import Pages.Search_Item_Page;
import base.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Item 

{
	//WebDriver driver = BaseClass.getDriver();
	Search_Item_Page search_Item_Page = new Search_Item_Page();

	@Given("Browser should be open")
	public void browserShouldBeOpen() {
		System.out.println("Flipcart Homepage is open");
	}

	@And("User should be on flipcart Homepage")
	public void userShouldBeOnFlipcartHomepage() {

	}

	@When("User enter the Mobile name in the Search box")
	public void user_enter_the_Mobile_name_in_the_Search_box() {
		search_Item_Page.enter_Item_Name();
	}

	@And("Click on search icon")
	public void click_on_search_icon() {
		search_Item_Page.click_Search_Icon();
	}

	@Then("Searched mobiles should be shown")
	public void searched_mobiles_should_be_shown() {
		System.out.println("Item is showing");

	}
}
