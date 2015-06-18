package roomManager.models.admin.resources;

import org.openqa.selenium.By;

public enum DeleteResourcesPageModel {

	DELETE_RESOURCE_BUTTON(By.xpath("//div[3]/div[2]/button")),
	CANCEL_DELETE_RESOURCE_BUTTON(By.xpath("//div[3]/div/button"));
	
	public By value;
	
	private DeleteResourcesPageModel(By value){
		this.value = value;
	}
}