package roomManager.models.admin.location;

import org.openqa.selenium.By;

public enum DeleteLocationPageModel {

	DELETE_LOCATION_SAVE_BUTTON(By.xpath("//button[2]"));
		
	public By value;
	
	private DeleteLocationPageModel(By value){
		this.value = value;
	}
}