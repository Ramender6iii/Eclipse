package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumscriptTest {
	WebDriver driver; //make webriver into class so each test can run the driver
	
  @Test (priority=1)
  void launchweb() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://demo.opencart.com");
  }
  
  @Test (priority=2)
  void print() 
  {
	  System.out.println("hello");
  }

  @Test (priority=3)
  void close() 
  {
	  driver.close();
  }
  
  
  
}
