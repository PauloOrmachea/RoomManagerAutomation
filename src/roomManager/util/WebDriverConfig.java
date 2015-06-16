package roomManager.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
	
	private static WebDriverConfig instance = new WebDriverConfig();
	private static WebDriver driver;
	private WebDriverConfig(){}
	
	public static WebDriverConfig getInstance(){
		driver = null;
		return instance;
	}
	
	public static WebDriver getChromeDriver(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", ConfigReader.getChromeDriver());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver getFirefoxDriver(){
		if(driver == null){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
}
