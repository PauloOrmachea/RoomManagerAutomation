package roomManager.pages.admin.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.resources.AddResourcesPageModel;

public class AddResourcesPage {
	private WebDriver driver;
	private By addResourceNameTextFieldLocator = AddResourcesPageModel.ADD_RESOURCE_NAME_TEXTFIELD.value;
	private By addResourceDisplayNameTextFieldLocator = AddResourcesPageModel.ADD_RESOURCE_DISPLAY_NAME_TEXTFIELD.value;
	private By addResourceDescriptionTextFieldLocator = AddResourcesPageModel.ADD_RESOURCE_DESCRIPTION_TEXTFIELD.value;
	private By addResourceSaveButtonLocator = AddResourcesPageModel.ADD_RESOURCE_SAVE_BUTTON.value;
	private By addResourceCancelButtonLocator = AddResourcesPageModel.ADD_RESOURCE_CANCEL_BUTTON.value;
	
	
	
	public AddResourcesPage(WebDriver driver){
		this.driver = driver;
	}

	public AddResourcesPage enterResourceName(String resourceName){
		WebElement resourceNameTextField = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceNameTextFieldLocator));
		resourceNameTextField.sendKeys(resourceName);
		
		return this;
		
	}
	
	public AddResourcesPage enterResourceDisplayName(String resourceDisplayName){
		WebElement resourceDisplayNameTextField = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceDisplayNameTextFieldLocator));
		resourceDisplayNameTextField.sendKeys(resourceDisplayName);
		return this;
	}
	
	public AddResourcesPage enterResourceDescription(String resourceDescription){
		WebElement resourceDescriptionAreaText = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceDescriptionTextFieldLocator));
		resourceDescriptionAreaText.sendKeys(resourceDescription);
		return this;
	}
	
	public ResourcesPage clickSaveResourceButton(){
		WebElement saveResourceButton = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceSaveButtonLocator));
		saveResourceButton.click();
		return new ResourcesPage(driver);
	}
	
	public ResourcesPage clickCacelResourceButton(){
		WebElement saveResourceButton = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(addResourceCancelButtonLocator));
		saveResourceButton.click();
		return new ResourcesPage(driver);
	}
}