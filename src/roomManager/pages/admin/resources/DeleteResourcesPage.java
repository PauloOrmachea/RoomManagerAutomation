package roomManager.pages.admin.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.resources.DeleteResourcesPageModel;
import roomManager.util.Logs;

public class DeleteResourcesPage {
	private WebDriver driver;
	private By deleteResourceButtonLocator = DeleteResourcesPageModel.DELETE_RESOURCE_BUTTON.value;
	public DeleteResourcesPage(WebDriver driver){
		this.driver = driver;
	}
	public ResourcesPage clickDeleteResourceButton(){
		WebElement deleteResourceButton = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(deleteResourceButtonLocator));
		deleteResourceButton.click();
		Logs.info("DeleteResourcesPage - delete a resource");
		return new ResourcesPage(driver);
	}
}
