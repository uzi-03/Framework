package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ilocator2 {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
//		WebElement Searchfieldtxt = driver.findElement(By.name("field-keywords"));
//		WebElement Searchfieldtxt = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		WebElement Searchfieldtxt = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		Searchfieldtxt.sendKeys("Playstation 5");
//		WebElement SearchToClick = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		WebElement SearchToClick = driver.findElement(By.xpath("//span[@aria-label='Go']"));
		Searchfieldtxt.clear();
		Thread.sleep(1000);
		Searchfieldtxt.sendKeys("Playstation 5");
		Thread.sleep(1000);
		SearchToClick.click();
		
	}

}
