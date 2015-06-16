package roomManager.pages.admin.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import roomManager.models.admin.login.LoginPageModel;
import roomManager.pages.admin.homePage.AdminHomePage;

public class LoginPage {
	WebDriver driver;
	
	By loginButton = LoginPageModel.LOGIN_BUTTON.value;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public AdminHomePage clickSignInButton(){
		driver.findElement(loginButton).click();
		return new AdminHomePage(driver);
	}
}