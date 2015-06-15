
package roomManager.test.admin;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * Acceptance Test
 * For delete a resource
 */
public class AcceptanceTest04 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.20.208.174:4042/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void RoomManagerDeleteAResource() throws Exception {
    driver.get(baseUrl + "/admin/#/login");
    driver.findElement(By.cssSelector("input[type=\"text\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("User");
    driver.findElement(By.cssSelector("input[type=\"password\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("PAss");
    driver.findElement(By.xpath("//button")).click();
    driver.findElement(By.linkText("Resources")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[54]")).click();
    driver.findElement(By.id("btnRemove")).click();
    driver.findElement(By.cssSelector("button.info")).click();
  }

  @After
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

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}  