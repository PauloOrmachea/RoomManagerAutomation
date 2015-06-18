package roomManager.pages.admin.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.login.LoginPageModel;
import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.util.ConfigReader;
import roomManager.util.Logs;

public class LoginPage {
	private WebDriver driver;
	private By loginButtonLocator = LoginPageModel.LOGIN_BUTTON.value;
	private By usernameTextFieldLocator = LoginPageModel.USERNAME_TEXT_FIELD.value;
	private By passwordTextFieldLoactor = LoginPageModel.PASSWORD_TEXT_FIELD.value;
	

	public LoginPage(WebDriver driver){
		this.driver = driver;
		driver.get(ConfigReader.getAdminURL());
		driver.navigate().refresh();
	}
	
	public AdminHomePage clickLoginButton(){
		WebElement loginButton = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(loginButtonLocator));
		loginButton.click();
		Logs.info("Login - click on the login");
		return new AdminHomePage(driver);
	}
	
	public LoginPage enterUserName(String username){
		WebElement usernameTextField = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(usernameTextFieldLocator));
		usernameTextField.sendKeys(username);
		Logs.info("Login - type the username");
		return this;
	}
	
	public LoginPage enterPassword(String password){
		WebElement passwordTextField = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(passwordTextFieldLoactor));
		passwordTextField.sendKeys(password);
		Logs.info("Login - type the password");
		return this;
	}
}