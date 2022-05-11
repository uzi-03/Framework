package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Llocators {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement Searchfieldtxt = driver.findElement(By.name("field-keywords"));
		Searchfieldtxt.sendKeys("Playstation 5");
		WebElement Searchicon = driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
		WebElement Linktext = driver.findElement(By.linkText("Today's Deals"));
		Linktext.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
