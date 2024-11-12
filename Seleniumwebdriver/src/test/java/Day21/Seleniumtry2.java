package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumtry2 {

	public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://rnd.digisingapore.com/QCWebsite/QA_Form");
	      
	      /*
	      // getTitle() to obtain page title
	      System.out.println("Page title is : " + driver.getTitle());
	      */
	      WebDriverWait wait = new WebDriverWait(driver, 10);
	      
	      try {
	    	    // Select User ID
	    	    WebElement userID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtUserID']/option[8]")));
	    	    userID.click(); // Select the option

	    	    // Enter Password
	    	    WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtPassword']")));
	    	    password.sendKeys("qaramesh");

	    	    // Click Login
	    	    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnSave']")));
	    	    login.click();
	    	} catch (Exception e) {
	    	    e.printStackTrace(); // Handle exceptions as needed
	    	}
	        
	    //validate title should be "your Store"
	      String act_title=driver.getTitle();
	      
	      if(act_title.equals("Your Store")) {
	    	  System.out.println("Test Passed");
	      }else {
	    	  System.out.println("Test Failed");./
	      }
	    	  
	}

	}

