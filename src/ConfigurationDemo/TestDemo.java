package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ConfigReader;

public class TestDemo {
	
public static void main(String[] args) throws Exception {
	ConfigReader config=new ConfigReader();
	System.setProperty("webdriver.chrome.driver",config.getChromepath());
	WebDriver driver=new ChromeDriver();
	driver.get(config.getApplicationUrl());
	

	
}
}
