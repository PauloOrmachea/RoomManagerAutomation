package roomManager.pages.admin.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Libraries for the login model and the AdminHomePage
import roomManager.models.admin.login.LoginPageModel;
import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.util.ConfigReader;

public class LoginPage {
	private WebDriver driver;

	//Locators for the loginPage
	private By loginButtonLocator = LoginPageModel.LOGIN_BUTTON.value;
	private By usernameTextFieldLocator = LoginPageModel.USERNAME_TEXT_FIELD.value;
	private By passwordTextFieldLoactor = LoginPageModel.PASSWORD_TEXT_FIELD.value;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
		//For get the URL of the loginPage
		driver.get(ConfigReader.getAdminURL());
		
		//For refresh the page because is needed for this room manager build
//		driver.navigate().refresh();
	}
	
	//Method for the Login Button
	public AdminHomePage clickLoginButton(){
		WebElement signInButton = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(loginButtonLocator));
		signInButton.click();
		return new AdminHomePage(driver);
	}
	
	//Method for introduce the user name
	public LoginPage enterUserName(String username){
		WebElement usernameTextField = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(usernameTextFieldLocator));
		usernameTextField.sendKeys(username);
		return this;
	}
	
	//Method for introduce the password
	public LoginPage enterPassword(String password){
		WebElement passwordTextField = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(passwordTextFieldLoactor));
		passwordTextField.sendKeys(password);
		return this;
	}
}