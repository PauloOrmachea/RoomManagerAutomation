package roomManager.pages.admin.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import roomManager.models.admin.common.MenuItem;

public class MenuPage {

	WebDriver driver;

	By emailServersLink = MenuItem.EMAIL_SERVERS_LINK.value;
	By impersonationLink = MenuItem.IMPERSONATION_LINK.value;
	By conferenceRoomsLink = MenuItem.CONFERENCE_ROOMS_LINK.value;
	By resourcesLink = MenuItem.RESOURCES_LINK.value;
	By locationsLink = MenuItem.LOCATIONSLINK.value;
	
	public MenuPage(WebDriver driver){
		this.driver = driver;
	}
} 