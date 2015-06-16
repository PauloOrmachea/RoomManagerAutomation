package roomManager.models.admin.locations;

import org.openqa.selenium.By;

public enum RemoveLocationPageModel {

	REMOVE_LOCATION_SAVE_BUTTON(By.xpath("//button[2]"));
		
	public By value;
	
	private RemoveLocationPageModel(By value){
		this.value = value;
	}
}