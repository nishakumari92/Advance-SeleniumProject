package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Repo.Home_Page;
import POM_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassUtility { 
	
	public static WebDriver sdriver;
	public WebDriver driver;
		@BeforeSuite(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void BS() 
		{
			System.out.println("DataBase connection");
		}
		@BeforeTest(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void BT() 
		{
			System.out.println("Parallel execution");
		}
		
//		@Parameters("BROWSER")
		@BeforeClass(groups={"SmokeTest","SanityTest","RegressionTest"})
//		public void BC(String BROWSER) throws Throwable
		public void BC() throws Throwable
		{
		Property_Utility plib = new Property_Utility();
		String BROWSER = plib.getKeyValue("browser");
			
			
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			else if(BROWSER.equalsIgnoreCase("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else if(BROWSER.equalsIgnoreCase("edge"))
			{
				
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else
			{
				driver = new ChromeDriver();
			}
			System.out.println("Launching browser");
			sdriver=driver;
		}
		@BeforeMethod(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void BM() throws Throwable 
		{
			Property_Utility plib = new Property_Utility();
			String URL = plib.getKeyValue("url");   
		    String USERNAME = plib.getKeyValue("username");
		    String PASSWORD = plib.getKeyValue("password");
		  //Login to Vtiger Application
		    driver.get(URL);
		    Login_Page login=new Login_Page(driver);
		    login.loginToApp(USERNAME, PASSWORD);
			
			System.out.println("Login Application");
		}
		
		@AfterMethod(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void AM()throws Throwable 
		{
			Home_Page home=new Home_Page(driver);
			home.logout(driver);
			System.out.println("Logout Application");
		}
		@AfterClass(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void AC()
		{
			System.out.println("Browser Closed");
		}
		
		@AfterTest(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void AT()
		{
			System.out.println("Parallel Execution Done");
		}
		@AfterSuite(groups={"SmokeTest","SanityTest","RegressionTest"})
		public void AS()
		{
			System.out.println("DataBase Connection close");
		}
		}

	


