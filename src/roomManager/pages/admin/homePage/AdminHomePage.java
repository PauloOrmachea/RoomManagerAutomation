package roomManager.pages.admin.homePage;

import org.openqa.selenium.WebDriver;
import roomManager.pages.admin.common.MenuPage;

public class AdminHomePage extends MenuPage{
	WebDriver driver;
	
	public AdminHomePage(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
}