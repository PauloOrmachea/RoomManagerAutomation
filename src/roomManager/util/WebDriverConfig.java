package roomManager.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
	
	private static WebDriverConfig instance = new WebDriverConfig();
	
	private static WebDriver driver = null;
	
	private WebDriverConfig(){
		
	}
	/*
	 * We don't need a external driver for work with Firefox
	 */
	public static WebDriver firefoxDriver(){
		if(driver == null){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	/*
	 * For work with Chrome we need a external driver locate in the resources folder 
	 */
	
	public static WebDriver chromeDriver(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", ConfigReader.getChromeDriver());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static WebDriverConfig getInstance(){
		return instance;
	}
}