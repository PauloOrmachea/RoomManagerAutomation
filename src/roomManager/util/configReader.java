package roomManager.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	static Properties prop = new Properties();
	static InputStream input = null;
	public static Properties getConfigReader(){
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
		return prop; 
	}

	
	public static String getAdminURL(){
		return getConfigReader().getProperty("ADMIN-URL");
	}
	public static String getTabletURL(){
		return getConfigReader().getProperty("TABLET-URL");
	}
	public static String getChromeDriver(){
		return getConfigReader().getProperty("CHROME-DRIVER");
	}
	public static String getRoomManagerUserName(){
		return getConfigReader().getProperty("ROOM_MANAGER_USERNAME");
	}
	public static String getRoomManagerPassword(){
		return getConfigReader().getProperty("ROOM_MANAGER_PASSWORD");
	}

}
