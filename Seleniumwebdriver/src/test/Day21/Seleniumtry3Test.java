package Day21;

import org.testng.annotations.Test;
	

public class Seleniumtry3Test {
	WebDriver driver;
	
  @Test (priority=1)
  
  void openapp() {
	  driver= new ChromeDriver();
	  
  }
}
