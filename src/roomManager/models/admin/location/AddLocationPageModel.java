package roomManager.models.admin.location;

import org.openqa.selenium.By;

public enum AddLocationPageModel {
	
	ADD_LOCATION_NAME_TEXTFIELD(By.xpath("//input[@id='location-add-name']")),
	ADD_LOCATION_DISPLAY_NAME_TEXTFIELD(By.xpath("//input[@id='location-add-display-name']")),
	ADD_LOCATION_DESCRIPTION_TEXTFIELD(By.xpath("//textarea[@id='location-add-description']")),
	ADD_LOCATION_SAVE_BUTTON(By.xpath("//button[2]"));
	
	public By value;
	
	private AddLocationPageModel(By value){
		this.value = value;
	}

}