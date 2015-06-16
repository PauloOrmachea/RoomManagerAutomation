package roomManager.models.admin.resources;

import org.openqa.selenium.By;

public enum RemoveResourcesPageModel {

	REMOVE_RESOURCE_BUTTON(By.xpath("//div[3]/div[2]/button")),
	CANCEL_REMOVE_RESOURCE_BUTTON(By.xpath("//div[3]/div/button"));
	
	public By value;
	
	private RemoveResourcesPageModel(By value){
		this.value = value;
	}
}