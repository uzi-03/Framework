package piit.AutomationTrainingProgram;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MultiWindow {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions ob = new Actions(driver);
		WebElement NewReleases = driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		NewReleases.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		
		driver.getWindowHandle();
		Set<String> WindowHandles = driver.getWindowHandles();
		
		Iterator<String> iterators = WindowHandles.iterator();
		String Parent = iterators.next();
		String secondwindow = iterators.next();
		System.out.println("This is parent window = " + Parent);
		System.out.println("This is the second window = " + secondwindow);
		driver.switchTo().window(secondwindow);
		WebElement Products = driver.findElement(By.linkText("Camera & Photo Products"));
		Products.click();
		
		Thread.sleep(2000);
		driver.switchTo().window(Parent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
