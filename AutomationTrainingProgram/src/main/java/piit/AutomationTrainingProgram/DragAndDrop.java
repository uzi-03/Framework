package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		WebElement DropLink = driver.findElement(By.linkText("Droppable"));
		DropLink.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement Draggable = driver.findElement(By.id("draggable"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		Actions ob = new Actions(driver);
		Thread.sleep(3000);
		ob.dragAndDrop(Draggable, Droppable).build().perform();
		
		driver.switchTo().parentFrame();
		WebElement Sorting = driver.findElement(By.linkText("Sortable"));
		Sorting.click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
