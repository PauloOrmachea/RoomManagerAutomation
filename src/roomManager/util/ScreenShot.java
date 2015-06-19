package roomManager.util;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import roomManager.util.Logs;

public class ScreenShot extends TestListenerAdapter {

	//Take screen shot only for failed test case
	@Override
	public void onTestFailure(ITestResult tr) {
		takeScreenShot(tr.getName());
		
		WebDriver driver = new FirefoxDriver();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
			Logs.info("se tomo la screshoot");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
	//ScreenShot();
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
	//ScreenShot();
	}

	private void takeScreenShot(String testname) {
	try {

	String NewFileNamePath;

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension scrnsize = toolkit.getScreenSize();

	File directory = new File (".");
	
	DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
	Date date = new Date();

	NewFileNamePath = directory.getCanonicalPath()+ "\\screenshots\\" + testname+"_" +dateFormat.format(date)+"_"+ ".png";

	Robot robot = new Robot();
	BufferedImage bi=robot.createScreenCapture(new Rectangle(scrnsize));
	ImageIO.write(bi, "png", new File(NewFileNamePath));
	} 
	catch (AWTException e) {
	e.printStackTrace();
	} 
	catch (IOException e) {
	e.printStackTrace();
	}
	}

}
 