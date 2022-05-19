package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;
import PageObjectModel.Home;

import org.testng.annotations.DataProvider;

public class NewTest extends Utility {
  @Test(dataProvider = "Providers")
  public void f(String n, String s) throws InterruptedException {
	  Home home = new Home(driver);
	  home.Email(n);
	  home.PsswordFieldsEnters(s);
	  Thread.sleep(4000);
	  home.loginbt();
	  Thread.sleep(4000);
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
  }

  @DataProvider
  public Object[][] Providers() {
    return new Object[][] {
      new Object[] { "John@gmail.com", "Automation1" },
      new Object[] { "LongSilver@aol.com", "Fries3" },
    };
  }
}
