package Generic_Utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	
	/**
	 * 
	 * @param driver
	 * @param PartialWindowTitle
	 */
	
public void switchWindow(WebDriver driver,String PartialWindowTitle)

{
	  Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.switchTo().window(parentId);
 }


public void moveToElement(WebDriver driver, WebElement element)

 {
	Actions a = new Actions(driver);
    a.moveToElement(element).perform();
 }
}

