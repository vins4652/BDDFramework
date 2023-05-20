package utils;

import java.io.IOException;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	//public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public String LandingpageProductName;
	public String offerPageProductName;
	public String cartPageProductName;
	public TestBase testBase;
	
	
	public TestContextSetup() throws IOException {
		
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	}
	
	
}
