package M.common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
	public WebDriver driver;
	@Parameters ({"browsers"})
  @BeforeClass
  public void beforeClass(String window) {
		String windows = System.getProperty("user.dir");
		System.out.println(windows);
	  
	  if(window.equalsIgnoreCase("Chrome")) {
		  	System.setProperty("webdriver.chrome.driver", windows+"\\Drivers\\chromedriver.exe");
		  	driver = new ChromeDriver();
		  	driver.navigate().to("https://www.facebook.com/");
		  	driver.manage().window().maximize();
		  
		  }else if(window.equalsIgnoreCase("Edge")) {
	  		System.setProperty("webdriver.edge.driver", windows+"\\Drivers\\msedgedriver.exe");
	  		driver = new EdgeDriver();
	  		driver.navigate().to("https://www.facebook.com/");
		  	driver.manage().window().maximize();	
		  
		  }else if(window.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", windows+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		}
  }
	  

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	  Thread.sleep(3000);
	  driver.close();	  
  }
  
	  

  public void Pictures() throws IOException {
	
	Date dt = new Date();
	String sk = dt.toString().replace(" ", "_").replace(":", "_");
	System.out.println(sk);
	String windows = System.getProperty("user.dir");
	File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshots, new File(windows+"\\Pictures\\"+sk+"ShotOfPage.jpg"));
		
}

}
