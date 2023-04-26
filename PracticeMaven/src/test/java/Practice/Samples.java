package Practice;
import org.testng.annotations.Test;

public class Samples {
	
	@Test
	public void m1()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);

  }
}
