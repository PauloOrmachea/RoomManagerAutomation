package roomManager.models.admin.resources;

import org.openqa.selenium.By;

public enum ResourcesPageModel {

		ADD_RESOURCE_BUTTON(By.xpath("//div/div/button")),
		//DELETE_RESOURCE_BUTTON(By.xpath("//button[@id='btnRemove']")),
		DELETE_RESOURCE_BUTTON(By.id("btnRemove")),
		SEARCH_RESOURCE_TEXTFIELD(By.xpath("//input[@type='text']")),
		//RESOURCE_TABLE_ELEMENT(By.xpath("//div[3]/div[2]/button")),
		RESOURCE_TABLE_ELEMENT(By.cssSelector("div.ng-scope > span.ng-binding")),
		RESOURCE_TABLE_ELEMENT_CHECKBOX(By.cssSelector("input.ngSelectionCheckbox")),
		RESSOURCE_TABLE(By.cssSelector("div.ngCanvas"));
		public By value;
		private ResourcesPageModel(By value){
			this.value = value;
		}
}
