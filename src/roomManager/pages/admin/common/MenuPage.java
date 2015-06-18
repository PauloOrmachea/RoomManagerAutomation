package roomManager.pages.admin.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import roomManager.models.admin.common.MenuItem;
import roomManager.pages.admin.locations.LocationPage;
import roomManager.pages.admin.resources.ResourcesPage;
import roomManager.util.Logs;

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

	public void selectEmailServerLink(){
		selectLink(emailServerLink, 60);
	}
	
	public void selectImpersonationLink(){
		selectLink(impersonationLink, 60);
	}
	
	public void selectConferenceRoomsLink(){
		selectLink(conferenceRoomsLink, 60);
	}
	
	public ResourcesPage selectResourcesLink(){
		selectLink(resourcesLink, 60);
		return new ResourcesPage(driver);
	}
	
	public LocationPage selectLocationsLink(){
		selectLink(locationsLink, 60);
		return new LocationPage(driver);
	}
	
	private void selectLink(By locator, long timeOutInseconds){
		WebElement link = (new WebDriverWait(driver, timeOutInseconds))
			.until(ExpectedConditions.presenceOfElementLocated(locator));
		Logs.info("common - click on the link item");
		link.click();
	}
} 