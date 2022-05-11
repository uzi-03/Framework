package piit.AutomationTrainingProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PizzaHut {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uzair\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement MenuDrop = driver.findElement(By.id("menu"));
		MenuDrop.click();
		
		Thread.sleep(2000);
		WebElement PizzaClick = driver.findElement(By.xpath("//*[@data-testid='menu-pizza-link']"));
		PizzaClick.click();
		
		Thread.sleep(4000);
		WebElement PopularPizzas = driver.findElement(By.xpath("//*[text()='popular pizzas']"));
		PopularPizzas.click();
		
		Thread.sleep(4000);
		WebElement OrderCheese = driver.findElement(By.xpath("//*[text()='Order Now'][1]"));
		OrderCheese.click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
