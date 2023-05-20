package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CartPage;
import utils.TestContextSetup;

public class CartPageGreenKartStepDef_03 {
	
	
	TestContextSetup testContextSetup;
	CartPage cartPage;
	
	public CartPageGreenKartStepDef_03(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.cartPage = testContextSetup.pageObjectManager.getCartPage();
	}
	
	@Then("^User proceeds to the checkout page and validate the (.+) item in checkout page$")
	public void User_proceeds_to_the_checkout_page_and_validate_the_shortName_item_in_checkout_page(String shotName) throws InterruptedException {
		testContextSetup.pageObjectManager.getLandingPage().proceedToCheckoutpage();
		
		testContextSetup.cartPageProductName=cartPage.getProductName().split("-")[0].trim();
		Assert.assertEquals(testContextSetup.cartPageProductName,testContextSetup.LandingpageProductName);
	}
	
	@Then("verify user has abiity to enter promocode and place the order")
	public void verify_user_has_abiity_to_enter_promocode_and_place_the_order() {
		Assert.assertTrue(cartPage.promoCodeEnability());
		Assert.assertTrue(cartPage.placeOrderButtonEnability());
	}
	
}
