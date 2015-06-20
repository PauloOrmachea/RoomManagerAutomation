package roomManager.models.admin.homePage;

import org.openqa.selenium.By;

public enum HomePage {
	ROOM_MANAGER_TITLE(By.linkText("Room Manager"));
	public By value;
	private HomePage(By value){
		this.value = value;
	}
}