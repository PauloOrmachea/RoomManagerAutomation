
package roomManager.test.admin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import roomManager.util.ConfigReader;
import roomManager.pages.admin.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/*
 * Acceptance Test
 * For create a new Resource
 */

public class AcceptanceTest01{
  private static WebDriver driver;
  private static String baseUrl;

  
  @Test
  public void testRoomManagerCreateAResource(){
	
	Logger logger=Logger.getLogger("testRoomManagerCreateAResource");
    PropertyConfigurator.configure("Log4j.properties");
	
    driver.get(baseUrl + "/admin//#//login");
    logger.info("Se abre el login page");
/*    
    driver.findElement(By.linkText("Resources")).click();
    
    driver.findElement(By.id("convert")).click();

    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='fa-eraser']")));
    driver.findElement(By.xpath("//button[@value='fa-eraser']")).click();

    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("SeleniumTest01");
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("TEst borrame");

    (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.xpath("button.info")));

    driver.findElement(By.cssSelector("button.info")).click();
  */ 
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", ConfigReader.getChromeDriver());
	  //driver = new FirefoxDriver();
	  //baseUrl = configReader.getAdminURL();
	  driver = new ChromeDriver();
	  baseUrl = "http://172.20.208.174:4042/";
	  driver.manage().window().maximize();
  }  
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  

} 





