package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataDrivenUtility {

	public String getCommonData(String keyPropery) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./src/test/resources/commonData.properties"));
		return prop.getProperty(keyPropery);
		
	}
}
