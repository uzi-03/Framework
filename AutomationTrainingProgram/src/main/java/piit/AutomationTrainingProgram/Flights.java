package piit.AutomationTrainingProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flights {
static WebDriver driver;	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		WebElement Departure = driver.findElement(By.id("d1-btn"));
		Departure.click();
		WebElement DepartureToDate = driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		DepartureToDate.click();
		Thread.sleep(3000);
		WebElement ArrivalFrom = driver.findElement(By.xpath("//*[@aria-label='Jun 17, 2022']"));
		ArrivalFrom.click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
