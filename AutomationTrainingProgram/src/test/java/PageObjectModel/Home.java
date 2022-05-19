package PageObjectModel;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(name = "email") WebElement Ids;
	@FindBy(name = "pass") WebElement Psswords;
	@FindBy(linkText = "Forgot password?") WebElement Forgot;
	@FindBy(name = "login") WebElement loginbutton;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Email(String name) {
		Ids.clear();
		Ids.sendKeys(name);	
	}
	
	public void PsswordFieldsEnters(String name) {
		Psswords.clear();
		Psswords.sendKeys(name);
	}
	
	public void ForgotLinkClick() {
		Forgot.click();
	}
	
	public void loginbt() {
		loginbutton.click();
	}

}
