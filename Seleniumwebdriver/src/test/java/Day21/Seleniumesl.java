package Day21;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Seleniumesl {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private static final String Assert = null;

		//@Test
		public void login() {
		//System.setProperty("webdriver.chrome.driver", "path of driver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		WebElement username=driver.findElement(By.id("user_email_Login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("your_password");
		login.click();
		String actualUrl="https://live.browserstack.com/dashboard";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		}

	}


