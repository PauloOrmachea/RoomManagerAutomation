package roomManager.pages.admin.locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.location.AddLocationPageModel;
import roomManager.util.Logs;

public class AddLocationPage {
	private WebDriver driver;
	private By addLocationNameTextFieldLocator = AddLocationPageModel.ADD_LOCATION_NAME_TEXTFIELD.value;
	private By addLocationDisplayNameTextFieldLocator = AddLocationPageModel.ADD_LOCATION_DISPLAY_NAME_TEXTFIELD.value;
	private By addLocationDescriptionTextFieldLocator = AddLocationPageModel.ADD_LOCATION_DESCRIPTION_TEXTFIELD.value;
	private By addLocationSaveButtonLocator = AddLocationPageModel.ADD_LOCATION_SAVE_BUTTON.value;
		
	public AddLocationPage(WebDriver driver){
		this.driver = driver;
	}

	public AddLocationPage enterLocationName(String locationName){
		WebElement locationNameTextField = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(addLocationNameTextFieldLocator));
		locationNameTextField.sendKeys(locationName);
		Logs.info("Location - enter the new location name");
		return this;
	}
	
	public AddLocationPage enterLocationDisplayName(String locationDisplayName){
		WebElement locationDisplayNameTextField = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(addLocationDisplayNameTextFieldLocator));
		locationDisplayNameTextField.sendKeys(locationDisplayName);
		Logs.info("Location - enter the new location display name");
		return this;
	}
	public AddLocationPage enterLocationDescription(String locationDescription){
		WebElement locationDescriptionTextField = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(addLocationDescriptionTextFieldLocator));
		locationDescriptionTextField.sendKeys(locationDescription);
		Logs.info("Location - enter the new location description");
		return this;
	}
	
	public LocationPage clickSaveLocationButton(){
		WebElement saveLocationButton = (new WebDriverWait(driver, 30))	.until(ExpectedConditions.presenceOfElementLocated(addLocationSaveButtonLocator));
		saveLocationButton.click();
		Logs.info("Location - click on the save location button");
		return new LocationPage(driver);
	}
}