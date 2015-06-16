package roomManager.pages.admin.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import roomManager.models.admin.common.MenuItem;
import roomManager.pages.admin.resources.AddResourcesPage;
import roomManager.pages.admin.resources.ResourcesPage;

public class MenuPage {
	private WebDriver driver;
	private By emailServerLink = MenuItem.EMAIL_SERVERS_LINK.value;
	private By impersonationLink = MenuItem.IMPERSONATION_LINK.value;
	private By conferenceRoomsLink = MenuItem.CONFERENCE_ROOMS_LINK.value;
	private By resourcesLink = MenuItem.RESOURCES_LINK.value;
	private By locationsLink = MenuItem.LOCATIONS_LINK.value;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectEmailServer(){
		WebElement emailServerLink = null; 
		emailServerLink.click();
	}

	public ResourcesPage selectResources(){
		WebElement resourcesLink = null; 
		resourcesLink.click();
		return null;
	}
	
	public void selectConferenceRooms(){
		WebElement conferenceRoomsLink = null; 
		conferenceRoomsLink.click();
	}
	
	public void selectLocations(){
		WebElement locationsLink = null;
		locationsLink.click();
	}
	
	
}