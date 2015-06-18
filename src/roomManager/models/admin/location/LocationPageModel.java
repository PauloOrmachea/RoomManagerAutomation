package roomManager.models.admin.location;

import org.openqa.selenium.By;

public enum LocationPageModel {

		ADD_LOCATION_BUTTON(By.xpath("//div[4]/div/button")),
		DELETE_LOCATION_BUTTON(By.xpath("//button[2]")),
		LOCATION_TABLE_ELEMENT(By.xpath("//div[3]/div[2]/button")),
		LOCATION_TABLE_ELEMENT_CHECKBOX(By.xpath("(//input[@type='checkbox'])[6]"));
		
		public By value;
		
		private LocationPageModel(By value){
			this.value = value;
		}
	
}
