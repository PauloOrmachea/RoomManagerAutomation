package roomManager.pages.admin.locations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.location.DeleteLocationPageModel;
import roomManager.util.Logs;

public class DeleteLocationPage {
	private WebDriver driver;
	private By deleteLocationButtonLocator = DeleteLocationPageModel.DELETE_LOCATION_SAVE_BUTTON.value;
	
	public DeleteLocationPage(WebDriver driver){
		this.driver = driver;
	}
	
	public LocationPage clickDeleteLocationButton(){
		WebElement deleteLocationButton = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(deleteLocationButtonLocator));
		deleteLocationButton.click();
		Logs.info("DeleteLocation - delete a location");
		return new LocationPage(driver);
	}
}