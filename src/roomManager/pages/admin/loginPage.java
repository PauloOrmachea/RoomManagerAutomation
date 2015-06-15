package roomManager.pages.admin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
  private WebDriver driver;
  private String baseUrl;

  public void setUp() throws Exception {
	driver = new ChromeDriver();
    baseUrl = "http://172.20.208.174:4042/";
	//baseUrl = configReader.getAdminURL();
  }

  public void loginLoadPage() throws Exception {
    driver.get(baseUrl + "/admin/#/login");
    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
    driver.findElement(By.xpath("//button")).click();
  }
  
  public void loginButton() throws Exception {
	    driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("User");
	    driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Pass");
	    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
	    driver.findElement(By.xpath("//button")).click();
	  }
}