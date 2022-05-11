package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
  @Test //5
  public void f() {
	  System.out.println("This is a test annotation");
  }
  @BeforeMethod //4
  public void beforeMethod() {
	  System.out.println("This is the before method annotation");
  }

  @AfterMethod //6
  public void afterMethod() {
	  System.out.println("This is the after method annotation");
  }
  
  @Test //5
  public void Test2() {
	  System.out.println("This is the 2nd Test annotation");
  }

  @BeforeClass //3
  public void beforeClass() {
	  System.out.println("This is the before class annotation");
  }

  @AfterClass //7
  public void afterClass() {
	  System.out.println("This is the after class annotation");
  }

  @BeforeTest //2
  public void beforeTest() {
	  System.out.println("This is the before Test annotation");
  }

  @AfterTest //8
  public void afterTest() {
	  System.out.println("This is the after Test annotation");
  }

  @BeforeSuite //1
  public void beforeSuite() {
	  System.out.println("This is the before Suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the after Suite annotation");
  }

}
