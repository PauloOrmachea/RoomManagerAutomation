package roomManager.models.admin.resources;

import org.openqa.selenium.By;

public enum DeleteResourcesPageModel {

	//DELETE_RESOURCE_BUTTON(By.xpath("//div[3]/div[2]/button")),
	DELETE_RESOURCE_BUTTON(By.cssSelector("button.info"));
	public By value;
	private DeleteResourcesPageModel(By value){
		this.value = value;
	}
}