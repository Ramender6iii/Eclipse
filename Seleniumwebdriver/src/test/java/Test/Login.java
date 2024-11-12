package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
  @Test
  void openapp() {
	  driver= new ChromeDriver();
	  driver.get("https://demo.opencart.com");
	  driver.manage().window().maximize();
  }
}
