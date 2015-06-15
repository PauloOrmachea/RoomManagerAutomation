package roomManager.test.admin;


import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class CreateResource {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();


  @Test  (priority=0)
  public void test01CreateResource() throws Exception {
	  
	  Logger logger=Logger.getLogger("test01CreateResource");
	  PropertyConfigurator.configure("resources\\Log4j.properties");
	  
	driver.get(baseUrl + "/admin/#/login");
	logger.info("Se abre el login page");
	driver.findElement(By.cssSelector("input[type=\"text\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("User");
    logger.info("Se introduce el username");
    driver.findElement(By.cssSelector("input[type=\"password\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Pass");
    logger.info("Se introduce el password");
    (new WebDriverWait(driver, 60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
    driver.findElement(By.xpath("//button")).click();
    logger.info("Se clickea en el boton enviar");
    driver.findElement(By.linkText("Resources")).click();
    (new WebDriverWait(driver, 60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button")));
    logger.info("Se clickea en la pestana de resources");
    driver.findElement(By.xpath("//div/div/button")).click();
    logger.info("Se clickea en el boton Add");
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Selenium001");
    logger.info("Se introduce el nombre del recurso");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium001");
    logger.info("Se introduce el displayname del recurso");
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("Borrame");
    logger.info("Se introuce la descripcion");
    (new WebDriverWait(driver, 60)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.info")));
    driver.findElement(By.cssSelector("button.info")).click();
    logger.info("Se clickea en el boton SAVE");
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium001");
    assertTrue(isElementPresent(By.xpath("//div[@id='resourcesGrid']/div[2]/div/div/div[2]/div[2]/div")));
    logger.info("Se verifica que exista el recurso creado");
  }

  @BeforeTest
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.20.208.174:4042/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  
  @AfterTest
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}