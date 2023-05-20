package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageGreenKartStepDef_02 {
	
	
	TestContextSetup testContextSetup;
	
	
	public OfferPageGreenKartStepDef_02(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Then("^User searched for same short name (.+) in offers page to check if product exists$")
	public void user_searched_for_same_short_name_in_offers_page_to_check_if_product_exists(String shotName) throws InterruptedException {
//		testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
//		Set<String> windowIds = testContextSetup.driver.getWindowHandles();
//		for (String wid : windowIds) {
//			if(testContextSetup.driver.switchTo().window(wid).getCurrentUrl().contains("offers")) {
//				testContextSetup.driver.findElement(By.id("search-field")).sendKeys(shotName);
//				testContextSetup.offerPageProductName=testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
//			}
//		}
		OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
		offerPage.openTopDealspage();
		//Thread.sleep(5000);
		offerPage.searchProduct(shotName);
		testContextSetup.offerPageProductName=offerPage.getProductName();
		System.out.println(testContextSetup.offerPageProductName+" offerPageProductName");
	}
	
	@Then("validate the home page product with offer page product")
	public void validate_the_home_page_product_with_offer_page_product() {
		Assert.assertEquals(testContextSetup.LandingpageProductName, testContextSetup.offerPageProductName);
	}
	
}
