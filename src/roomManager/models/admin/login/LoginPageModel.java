package roomManager.models.admin.login;

import org.openqa.selenium.By;

public enum LoginPageModel {
	LOGIN_BUTTON(By.xpath("//button"));
	
	public By value;
	
	private LoginPageModel(By value){
		this.value = value;
	}
}

 