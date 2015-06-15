package roomManager.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 *Class for get:
 *	Admin URL
 *	Tablet URL
 *	Google Chrome Drivet Location
 *From the config.properties fiel
 * 
 */

public class ConfigReader {
	static Properties prop = new Properties();
	InputStream input = null;
	public ConfigReader(){
		try {
			input = new FileInputStream("resources/config.properties");
			prop.load(input);
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String getAdminURL(){
		return prop.getProperty("ADMIN-URL");
	}
	public static String getTabletURL(){
		return prop.getProperty("TABLET-URL");
	}
	public static String getChromeDriver(){
		return prop.getProperty("CHROME-DRIVER");
	}
  }