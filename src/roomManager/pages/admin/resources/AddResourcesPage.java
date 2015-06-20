package roomManager.pages.admin.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.resources.AddResourcesPageModel;
import roomManager.util.Logs;

public class AddResourcesPage {
	private WebDriver driver;
	private By addResourceNameTextFieldLocator = AddResourcesPageModel.ADD_RESOURCE_NAME_TEXTFIELD.value;
	private By addResourceDisplayNameTextFieldLocator = AddResourcesPageModel.ADD_RESOURCE_DISPLAY_NAME_TEXTFIELD.value;
	private By addResourceDescriptionTextFieldLocator = AddResourcesPageModel.ADD_RESOURCE_DESCRIPTION_TEXTFIELD.value;
	private By addResourceSaveButtonLocator = AddResourcesPageModel.ADD_RESOURCE_SAVE_BUTTON.value;
		
	public AddResourcesPage(WebDriver driver){
		this.driver = driver;
	}

	public AddResourcesPage enterResourceName(String resourceName){
		WebElement resourceNameTextField = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceNameTextFieldLocator));
		resourceNameTextField.clear();
		resourceNameTextField.sendKeys(resourceName);
		Logs.info("AddResources - type the  resourceName");
		return this;
	}
	
	public AddResourcesPage enterResourceDisplayName(String resourceDisplayName){
		WebElement resourceDisplayNameTextField = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceDisplayNameTextFieldLocator));
		resourceDisplayNameTextField.clear();
		resourceDisplayNameTextField.sendKeys(resourceDisplayName);
		Logs.info("AddResources - type the resourceDisplayName");
		return this;
	}
	
	public AddResourcesPage enterResourceDescription(String resourceDescription){
		WebElement resourceDescriptionAreaText = (new WebDriverWait(driver,60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceDescriptionTextFieldLocator));
		resourceDescriptionAreaText.clear();
		resourceDescriptionAreaText.sendKeys(resourceDescription);
		Logs.info("AddResources - type the  resourceDescription");
		return this;
	}
	
	public ResourcesPage clickSaveResourceButton(){
		WebElement saveResourceButton = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceSaveButtonLocator));
		saveResourceButton.click();
		Logs.info("AddResources - click on the the save button");
		return new ResourcesPage(driver);
	}
}