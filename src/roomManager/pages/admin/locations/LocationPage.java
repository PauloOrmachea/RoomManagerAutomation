package roomManager.pages.admin.locations;

import org.junit.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import roomManager.util.ConfigReader;;

public class LocationPage {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	//System.setProperty("webdriver.chrome.driver", configReader.getChromeDriver());
	//driver = new ChromeDriver();
	driver = new FirefoxDriver();
    baseUrl = "http://172.20.208.174:4042/";
	driver.manage().window().maximize();
  }

  @Test
  public void testTemp() throws Exception {
    driver.get(baseUrl + "/admin/#/admin");
    driver.findElement(By.linkText("Locations")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Locations')]")).click();
    driver.findElement(By.xpath("//div[4]/div/button")).click();
    driver.findElement(By.cssSelector("#location-add-name")).sendKeys("Superq");
    driver.findElement(By.cssSelector("#location-add-display-name")).clear();
    driver.findElement(By.cssSelector("#location-add-display-name")).sendKeys("uper");
    driver.findElement(By.cssSelector("#location-add-description")).clear();
    driver.findElement(By.cssSelector("#location-add-description")).sendKeys("df");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click(); 
    }


} 