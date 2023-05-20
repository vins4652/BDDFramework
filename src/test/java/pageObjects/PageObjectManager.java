package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	private LandingPage landingPage;
	private OfferPage offerPage;
	private CartPage cartPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferPage() {
		offerPage =new OfferPage(driver);
		return offerPage;
	}
	
	public CartPage getCartPage() {
		cartPage = new CartPage(driver);
		return cartPage;
	}
}
