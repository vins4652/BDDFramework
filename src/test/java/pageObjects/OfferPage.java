package pageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {

	WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//private By topDealsPage = By.linkText("Top Deals");
	@FindBy(linkText = "Top Deals")
	private WebElement topDealsPage;
	
	public void openTopDealspage() {
		topDealsPage.click();
		Set<String> windowIds = driver.getWindowHandles();
		for (String wid : windowIds) {
			if(driver.switchTo().window(wid).getCurrentUrl().contains("offers")) {
				break;
			}
		}
	}
	
	//private By search = By.className("search-keyword");
	@FindBy(css = "input#search-field")
	private WebElement search;
	
	public void searchProduct(String productName) {
		search.sendKeys(productName);
	}
	
	//private By productName = By.cssSelector("h4.product-name");
	@FindBy(css = "tr td:nth-child(1)")
	private WebElement productName;
	
	public String getProductName() {
		return productName.getText();
	}
	
	
}
