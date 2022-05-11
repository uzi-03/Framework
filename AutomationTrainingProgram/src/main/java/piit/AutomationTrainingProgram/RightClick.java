package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		WebElement Picture = driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		
		
//		WebElement Picture = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td.pgCenter/div/table/tbody/tr/td.contentTd/p/img"));
		
		
//		WebElement Picture = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/div/table/tbody/tr/td/p/img"));
/*		Thread.sleep(4000);
		Actions ob = new Actions(driver);
		ob.contextClick(Picture).click().perform();
*/		
		Actions ob = new Actions(driver);
		  Thread.sleep(6000);
		  ob.contextClick(Picture).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
