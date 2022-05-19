package listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import M.common.Utility;

public class IListeners extends Utility implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utility)result.getInstance()).driver;
		Date dt=new Date();
		String sk=  dt.toString().replace(" ", "_").replace(":","_");
		System.out.println(sk);
		System.out.println(dt);
		String windows=	System.getProperty("user.dir");
		File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshots, new File(windows+"\\Pictures\\Passed\\"+sk+"ShotOfPage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utility)result.getInstance()).driver;
		Date dt=new Date();
		String sk=  dt.toString().replace(" ", "_").replace(":","_");
		System.out.println(sk);
		System.out.println(dt);
		String windows=	System.getProperty("user.dir");
		File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshots, new File(windows+"\\Pictures\\Failed\\"+sk+"ShotOfPage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
