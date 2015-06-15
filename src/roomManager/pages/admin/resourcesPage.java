package roomManager.pages.admin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResourcesPage{
	  private WebDriver driver;
	  private String baseUrl;

	  public void setUp() throws Exception {
		driver = new ChromeDriver();
	    baseUrl = "http://172.20.208.174:4042/";
		//baseUrl = configReader.getAdminURL();
	  }
	  
	  public void resourcesPageLoad() throws Exception {
		    driver.get(baseUrl + "/admin/resources/");
		    driver.findElement(By.linkText("Resources")).click();
      }

	  public void resourcesAddButton() throws Exception {
		    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		    driver.findElement(By.xpath("//button")).click();	  
	  }
	  
	  public void resourcesDeleteButton() throws Exception {
		    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		    driver.findElement(By.xpath("//button")).click();
	  }

}

