package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browser2 extends Utility{
	
  @Test
  public void f() {
	  WebElement ids = driver.findElement(By.name("email"));
	  ids.sendKeys("Uzair@home");
	  WebElement pssword = driver.findElement(By.name("pass"));
	  pssword.sendKeys("johnsilver");
	  WebElement loginbutton = driver.findElement(By.name("login"));
	  loginbutton.click();
	  
  }
  @BeforeClass
  public void beforeClass()  {
	 
  }

  @AfterClass
  public void afterClass() {
	 
  }

}
