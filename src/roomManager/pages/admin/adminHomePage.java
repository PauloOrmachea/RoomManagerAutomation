package roomManager.pages.admin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminHomePage{
  private WebDriver driver;
  private String baseUrl;

  public void setUp() throws Exception {
	driver = new ChromeDriver();
    baseUrl = "http://172.20.208.174:4042/";
	//baseUrl = configReader.getAdminURL();
  }

  public void loginAction() throws Exception {
    driver.get(baseUrl + "/admin");
    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
    driver.findElement(By.xpath("//button")).click();
  }
}

