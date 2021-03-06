package roomManager.pages.admin.locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.location.LocationPageModel;
import roomManager.pages.admin.common.MenuPage;
import roomManager.util.Logs;

public class LocationPage extends MenuPage{
	private WebDriver driver;
	private By addLocationButtonLocator = LocationPageModel.ADD_LOCATION_BUTTON.value;
	private By deleteLocationButtonLocator = LocationPageModel.DELETE_LOCATION_BUTTON.value;
	private By locationTableElementLocator = LocationPageModel.LOCATION_TABLE_ELEMENT.value;
	
	public LocationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
	public AddLocationPage clickAddLocationButton(){
		WebElement addLocationButton = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(addLocationButtonLocator));
		addLocationButton.click();
		Logs.info("LocationPage - click to the add button");
		return new AddLocationPage(driver);		
	}
	
	public DeleteLocationPage clickDeleteLocationButton(){
		WebElement deleteLocationButton = (new WebDriverWait(driver,60)).until(ExpectedConditions.presenceOfElementLocated(deleteLocationButtonLocator));
		deleteLocationButton.click();
		Logs.info("LocationPage - click to the delete location button");
		return new DeleteLocationPage(driver);
	}
	
	public String getTableElementbyName(){
		WebElement LocationTableElement = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(locationTableElementLocator));
		Logs.info("LocationPage - grab the location");
		return LocationTableElement.getText();
	}

	public LocationPage clickTableElementCheckBox(){
		WebElement LocationTableCheckBox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(locationTableElementLocator));
		LocationTableCheckBox.click();
		Logs.info("LocationPage - click on the location checkbox");
		return this;
	}
	public AddLocationPage doubleClickTableElement(){
		WebElement LocationTableElement = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(locationTableElementLocator));
		Actions doubleclick = new Actions(driver);
		doubleclick.doubleClick(LocationTableElement);
		doubleclick.perform();
		Logs.info("LocationPage - double click on the location element");
		return new AddLocationPage(driver);
	}

}
	
	
