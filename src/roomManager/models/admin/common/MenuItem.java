package roomManager.models.admin.common;

import org.openqa.selenium.By;

public enum MenuItem {
	EMAIL_SERVERS_LINK(By.linkText("Email Servers")),
	IMPERSONATION_LINK(By.linkText("Impersonation")),
	CONFERENCE_ROOMS_LINK(By.linkText("Conference Rooms")),
	RESOURCES_LINK(By.linkText("Resources")),
	LOCATIONSLINK(By.linkText("Locations"));
	
	public By value;	
	
	private MenuItem(By value){
		this.value = value;
	}
}