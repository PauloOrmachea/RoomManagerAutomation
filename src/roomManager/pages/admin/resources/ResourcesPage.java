package roomManager.pages.admin.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import roomManager.models.admin.resources.ResourcesPageModel;
import roomManager.pages.admin.common.MenuPage;
import roomManager.util.Logs;

public class ResourcesPage extends MenuPage{
	private WebDriver driver;
	private By addResourceButtonLocator = ResourcesPageModel.ADD_RESOURCE_BUTTON.value;
	private By deleteResourceButtonLocator = ResourcesPageModel.DELETE_RESOURCE_BUTTON.value;
	private By searchResourceTextFieldLocator = ResourcesPageModel.SEARCH_RESOURCE_TEXTFIELD.value;
	private By resourceTableElementLocator = ResourcesPageModel.RESOURCE_TABLE_ELEMENT.value;
	private By resourcesTableCheckBoxLocator = ResourcesPageModel.RESOURCE_TABLE_ELEMENT.value;
	
	public ResourcesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public AddResourcesPage clickAddResourceButton(){
		WebElement addResourceButton = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(addResourceButtonLocator));
		addResourceButton.click();
		Logs.info("Resources - click on the add resource button");
		return new AddResourcesPage(driver);		
	}
	
	public DeleteResourcesPage clickDeleteResourceButton(){
		WebElement deleteResourceButton = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(deleteResourceButtonLocator));
		deleteResourceButton.click();
		Logs.info("Resources - click on the delete button");
		return new DeleteResourcesPage(driver);
	}
	
	public ResourcesPage searchResourceByName(String newResourceName){
		WebElement searchResourceTextField = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(searchResourceTextFieldLocator));
		searchResourceTextField.clear();
		searchResourceTextField.sendKeys(newResourceName);
		Logs.info("Resources - search for a resource by name");
		return this;
	}
	
	public String getTableElementbyName(){
		WebElement ResourceTableElement = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(resourceTableElementLocator));
		Logs.info("Resources - get the resoult resource of the search");
		return ResourceTableElement.getText();
	}

	public ResourcesPage clickTableElementCheckBox(){
		WebElement ResourceTableCheckBox = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(resourcesTableCheckBoxLocator));
		ResourceTableCheckBox.click();
		Logs.info("Resources - click the checkbox of the element");
		return this;
	}
	
	public AddResourcesPage doubleClickTableElement(){
		WebElement ResourceTableElement = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(resourceTableElementLocator));
		Actions doubleclick = new Actions(driver);
		doubleclick.doubleClick(ResourceTableElement);
		doubleclick.perform();
		Logs.info("Resources - click the checkbox of the element");
		return new AddResourcesPage(driver);
	}
}
