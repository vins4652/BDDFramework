package utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	private WebDriver driver;
	private TestDataDrivenUtility testDataDrivenUtility = new TestDataDrivenUtility();
	public WebDriver WebDriverManager() throws IOException {
		if(driver == null) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
			
			
			if(testDataDrivenUtility.getCommonData("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}else if (testDataDrivenUtility.getCommonData("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(testDataDrivenUtility.getCommonData("QAurl"));
		}
		return driver;
	}
}
