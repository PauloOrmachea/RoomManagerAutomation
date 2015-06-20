package roomManager.pages.admin.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.homePage.HomePage;
import roomManager.pages.admin.common.MenuPage;
import roomManager.util.Logs;

public class AdminHomePage extends MenuPage{
	private WebDriver driver;
	private By roomManagerTitleLocator = HomePage.ROOM_MANAGER_TITLE.value;
	

	public AdminHomePage(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	public String getHomePageTittleText(){
		WebElement roomManagerTittle = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(roomManagerTitleLocator));
		Logs.info("AdminHomePage - click on the homepage");
		return roomManagerTittle.getText();
	}
} 