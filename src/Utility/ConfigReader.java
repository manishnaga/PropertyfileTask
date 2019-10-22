package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	public ConfigReader() {
		try {
			File src=new File("C:\\Users\\Manikandan\\eclipse-workspace\\aa\\PropertiesDemo\\Configuration\\Config.properties");
			FileInputStream fs;
			fs = new FileInputStream(src);
			prop=new Properties();
			prop.load(fs);
		} 
		catch (Exception e) {
			System.out.println("Exception is an " + e.getMessage());
		}
	}
	public String getChromepath() {
		String path = prop.getProperty("ChromeDriver");
		return path;
	}
	public String getApplicationUrl() {
		return prop.getProperty("URL");
		
	}

}
