package roomManager.pages.admin.locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.locations.LocationPageModel;
import roomManager.pages.admin.common.MenuPage;

public class LocationPage extends MenuPage{
	public LocationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private WebDriver driver;
	private By addLocationButtonLocator = LocationPageModel.ADD_LOCATION_BUTTON.value;
	private By removeLocationButtonLocator = LocationPageModel.REMOVE_LOCATION_BUTTON.value;
	private By locationTableElementLocator = LocationPageModel.LOCATION_TABLE_ELEMENT.value;
	private By locationTableCheckBoxLocator = LocationPageModel.LOCATION_TABLE_ELEMENT.value;
	

	
	
}