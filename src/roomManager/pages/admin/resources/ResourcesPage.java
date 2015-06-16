package roomManager.pages.admin.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import roomManager.models.admin.resources.ResourcesPageModel;
import roomManager.pages.admin.common.MenuPage;

public class ResourcesPage extends MenuPage{
	private WebDriver driver;
	private By addResourceButtonLocator = ResourcesPageModel.ADD_RESOURCE_BUTTON.value;
	private By removeResourceButtonLocator = ResourcesPageModel.REMOVE_RESOURCE_BUTTON.value;
	private By searchResourceTextFieldLocator = ResourcesPageModel.SEARCH_RESOURCE_TEXTFIELD.value;
	private By resourceTableElementLocator = ResourcesPageModel.RESOURCE_TABLE_ELEMENT.value;
	
	public ResourcesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


	
	public AddResourcesPage clickAddResourceButton(){
		WebElement addResourceButton = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(addResourceButtonLocator));
		addResourceButton.click();
		return new AddResourcesPage(driver);		
	}
	
	public RemoveResourcesPage clickRemoveResourceButton(){
		WebElement removeResourceButton = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(removeResourceButtonLocator));
		removeResourceButton.click();
		return new RemoveResourcesPage();
	}
	
	public ResourcesPage searchResourceByName(String name){
		WebElement searchResourceTextField = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(searchResourceTextFieldLocator));
		searchResourceTextField.sendKeys(name);
		return this;
	}
	
	public String getTableElementbyName(){
		WebElement ResourceTableElement = (new WebDriverWait(driver, 160))
			.until(ExpectedConditions.presenceOfElementLocated(resourceTableElementLocator));
		return ResourceTableElement.getText();
	}
	
	public ResourcesPage clickTableElementCheckBox(){
		WebElement firstResourceTableCheckBox = (new WebDriverWait(driver, 160))
			.until(ExpectedConditions.presenceOfElementLocated(resourcesTableCheckBoxLocator));
		firstResourceTableCheckBox.click();
		return this;
	}
	
	
	
}
