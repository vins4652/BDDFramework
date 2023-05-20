package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageGreenKartStepDef_01 {

//	public WebDriver driver;
//	public String LandingpageProductName;
//	public String offerPageProductName;
	TestContextSetup testContextSetup;
	LandingPage landingPage ;
	
	public LandingPageGreenKartStepDef_01(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on GreenKart Landing page")
	public void user_is_on_green_kart_landing_page() throws IOException {
		//it is triggered where the driver reference is initialized
		//testContextSetup.testBase.WebDriverManager().get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Assert.assertTrue(landingPage.getLandingPageTitle().contains("GreenKart"));
	}
	
	@When("^User searched with the short name (.+) and extracted actual name of the product$")
	public void user_searched_with_the_short_name_and_extracted_actual_name_of_the_product(String shotName) throws InterruptedException {
		//testContextSetup.driver.findElement(By.className("search-keyword")).sendKeys(shotName);
		
		landingPage.searchProduct(shotName);
		Thread.sleep(2000);
		//testContextSetup.LandingpageProductName = testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		testContextSetup.LandingpageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.LandingpageProductName+" LandingpageProductName");
	}
	
	@When("^Add the (\\d+) quantity of (.+) searched item to the cart$")
	public void Add_the_count_quantity_searched_item_to_the_cart(int count, String shortName) {
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.increaseTheItemToBuy(shortName, count);
		landingPage.addItemToCart(shortName);
	}
}
