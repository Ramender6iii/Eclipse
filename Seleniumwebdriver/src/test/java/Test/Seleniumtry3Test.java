package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seleniumtry3Test {
	WebDriver driver;
  @Test
  public void mainTest() {
    throw new RuntimeException("Test not implemented");

	driver.get("https://demo.opencart.com");
    //driver.manage().window().maximize();
    
    //name
    driver.findElement(By.name("search")).sendKeys("Mac");
  }
}
