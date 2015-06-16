package roomManager.pages.admin.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.resources.RemoveResourcesPageModel;


public class RemoveResourcesPage {
	private WebDriver driver;
	private By removeResourceButtonLocator = RemoveResourcesPageModel.REMOVE_RESOURCE_BUTTON.value;
	
	public RemoveResourcesPage(WebDriver driver){
		this.driver = driver;
	}
	
	public ResourcesPage clickRemoveResourceButton(){
		WebElement removeResourceButton = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(removeResourceButtonLocator));
		removeResourceButton.click();
		(new WebDriverWait(driver, 60)).until(ExpectedConditions.invisibilityOfElementLocated(removeResourceButtonLocator));
		return new ResourcesPage(driver);
	}
}