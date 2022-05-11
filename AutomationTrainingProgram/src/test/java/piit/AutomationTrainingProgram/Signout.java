package piit.AutomationTrainingProgram;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Signout extends Utility {
	
  @Test (priority = 1)
  public void f() throws InterruptedException, IOException {
	  Home ob = new Home(driver);
	  ob.Email();
	  Pictures();
	  Thread.sleep(2000);
	  ob.PsswordFieldsEnters();
	  Pictures();
	  Thread.sleep(2000);
	  ob.ForgotLinkClick();
	  ForgotPasswordPage id = new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();	  	  
	  Thread.sleep(2000); 
	  Pictures();
	  
//(priority = 2, dependsOnMethods = "f")
}
  
  @Test (priority = 2, dependsOnMethods = "f")
  public void TextVerificationMethod() throws InterruptedException {
	  Thread.sleep(4000);
	  ForgotPasswordPage id = new ForgotPasswordPage(driver);
	  driver.navigate().back();
	  String Questions = id.QuestionOfText();
	  SoftAssert softit = new SoftAssert();
	  softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
	  System.out.println("SoftAssert comparison successful");
	  softit.assertAll();
	  
  }
   
  @BeforeClass
  public void beforeClass() {
	  		
  }
  @AfterClass
  public void afterClass() {
	    
  }
 
	  
		 
	  
	  
  


}
