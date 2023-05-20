package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt",
					glue = "stepDefinitions",
					monochrome = true,
					plugin = {"pretty","html:target/cucumberHTML.html","json:target/cucumberJSON.json",
							"junit:target/cuccumberXML.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)
//to generate the extent report add dependences of extentreporter and extentreporter cucumber7 adapter
// add the keyword in plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
// create one extent.properties file in src/test/resources
/*
 * basefolder.name=test-output/ExtentReport
 *basefolder.datetimepattern=d-MMM-YY HH-mm-ss
 *extent.reporter.spark.start=true
 *extent.reporter.spark.out=Spark.html
 *screenshort.dir=test-output/Screenshots
 *screenshort.rel.path=./Screenshots/
 */
// add these lines in properties file
public class GreenkartFailedTestRunnerTestNG2 extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true) // it will run the all the scenario at the same time, parallel mode.
	public Object [][] scenarios(){
		
		return super.scenarios();
		
	}

}
