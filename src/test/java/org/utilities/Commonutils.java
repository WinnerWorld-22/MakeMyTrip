package org.utilities;



import java.io.IOException;
import java.util.Properties;

import contants_Package.Constants;

public class Commonutils {


	public  void loadProperties() {
		

		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Constants.APP_URL=	properties.getProperty("APP_URL");
		Constants.BROWSER =properties.getProperty("BROWSER");
		Constants.USERNAME= properties.getProperty("UserName");
		Constants.PASWORD= properties.getProperty("Password");
		Constants.CHROME_DRIVER_LOCATION= properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIREFOX_DRIVER_LOCATION= properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION= properties.getProperty("EDGE_DRIVER_LOCATION");


	}
}
