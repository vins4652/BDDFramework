package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//private By search = By.className("search-keyword");
	@FindBy(className = "search-keyword")
	private WebElement search;
	
	public void searchProduct(String productName) {
		search.sendKeys(productName);
	}
	
	//private By productName = By.cssSelector("h4.product-name");
	@FindBy(css = "h4.product-name")
	private WebElement productName;
	
	public String getProductName() {
		return productName.getText();
	}
	
	public void increaseTheItemToBuy(String shortName, int count) {
		for (int i = 0; i < count-1; i++) {
			driver.findElement(By.xpath("//h4[contains(text(),'"+shortName+"')]/..//a[text()='+']")).click();
		}
	}
	
	public void addItemToCart(String shortName) {
		driver.findElement(By.xpath("//h4[contains(text(),'"+shortName+"')]/..//button[text()='ADD TO CART']")).click();
	}
	
	@FindBy(xpath = "//a[@class='cart-icon']//img")
	private WebElement cartLink;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement proceedToCheckoutButton;
	
	public void proceedToCheckoutpage() {
		cartLink.click();
		proceedToCheckoutButton.click();
	}
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
}
