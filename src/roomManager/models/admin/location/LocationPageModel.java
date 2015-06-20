package roomManager.models.admin.location;

import org.openqa.selenium.By;

public enum LocationPageModel {

		ADD_LOCATION_BUTTON(By.xpath("//div[4]/div/button")),
		DELETE_LOCATION_BUTTON(By.xpath("//button[2]")),
		//location of the first element of the table
		LOCATION_TABLE_ELEMENT(By.xpath("//div[@id='locationGrid']/div[2]/div/div/div[2]/div[2]/div"));
		//LOCATION_TABLE_ELEMENT(By.xpath("//div[3]/div[2]/button")),
		
		public By value;
		
		private LocationPageModel(By value){
			this.value = value;
		}
	
}
