package org.webDriverManger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import contants_Package.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	
	private static WebDriver driver=null;
	
	private static final Logger LOGGER= LogManager.getLogger(DriverManager.class);


	public static void launchBrowser() {
		// TODO Auto-generated method stub
		try {
			switch (Constants.BROWSER) {
			case "Edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				 driver = new EdgeDriver();
				 
				 break;
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				 driver = new ChromeDriver();
				
				
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				 driver = new FirefoxDriver();

			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				 driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		}


	public static WebDriver getDriver() {
		return driver;
	}
}
