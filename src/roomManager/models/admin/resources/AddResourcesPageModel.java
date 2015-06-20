package roomManager.models.admin.resources;

import org.openqa.selenium.By;

public enum AddResourcesPageModel {
	
	ADD_RESOURCE_NAME_TEXTFIELD(By.xpath("(//input[@type='text'])[3]")),
	ADD_RESOURCE_DISPLAY_NAME_TEXTFIELD(By.xpath("(//input[@type='text'])[4]")),
	ADD_RESOURCE_DESCRIPTION_TEXTFIELD(By.xpath("//textarea")),
	ADD_RESOURCE_SAVE_BUTTON(By.xpath("//div[3]/div[2]/button")),
	ADD_RESOURCE_CANCEL_BUTTON(By.xpath("//div[3]/div/button"));	
	public By value;
	private AddResourcesPageModel(By value){
		this.value = value;
	}

}
