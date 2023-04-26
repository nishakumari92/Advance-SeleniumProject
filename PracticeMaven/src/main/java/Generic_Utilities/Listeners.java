package Generic_Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestFailure(ITestResult result)
	{
		String testName= result.getMethod().getMethodName();
		System.out.println("------execute------");
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClassUtility.sdriver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File("./Screenshot/"+testName+".png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
