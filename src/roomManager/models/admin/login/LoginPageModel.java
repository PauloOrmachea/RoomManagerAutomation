package roomManager.models.admin.login;

import org.openqa.selenium.By;

public enum LoginPageModel {
	
	//locators for the login page
	LOGIN_BUTTON(By.xpath("//button")),
	USERNAME_TEXT_FIELD(By.cssSelector("input[type='text']")),
	PASSWORD_TEXT_FIELD(By.cssSelector("input[type='password']"));
	
	public By value;
	
	private LoginPageModel(By value){
		this.value = value;
	}
}

 