package step_Defenition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.utilities.Commonutils;
import org.webDriverManger.DriverManager;


import io.cucumber.java.Before;

public class Common_Step_Definition {
	
	
	
	
	
	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definition.class);
	
	
	
	@Before
	public void beforeScenario() {
		
		LOGGER.info("Execution Started");
	
		try {
			LOGGER.info("Instantiating the commonutils");
			Commonutils commonutils = new Commonutils();
			LOGGER.info("loading the properties file");
			commonutils.loadProperties();
			LOGGER.info("Checking the driver is null or not?");
			if(DriverManager.getDriver()==null) {
				LOGGER.info("Driver is null.Instatiating the bowser");
				DriverManager.launchBrowser();  
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		
	

		
}
	
		

