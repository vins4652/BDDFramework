package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//tbody td:nth-child(2) - using css selector
	//p.product-name - using css selector
	@FindBy(css = ".product-name")
	private WebElement productName;
	
	public String getProductName() {
		return productName.getText();
	}
	
	@FindBy(css = ".promoBtn")
	private WebElement applyButton;
	
	public boolean promoCodeEnability() {
		if(applyButton.isEnabled()) {
		return true;
		}else
			return false;
	}
	
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderutton;
	
	public boolean placeOrderButtonEnability() {
		if(placeOrderutton.isEnabled()) {
			return true;
		}else
			return false;
	}
}
