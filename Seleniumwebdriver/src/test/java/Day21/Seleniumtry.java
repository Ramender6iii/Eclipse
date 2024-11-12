package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumtry {

	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://rnd.digisingapore.com/QCWebsite/QA_Form");
	      
	      
	      System.out.println("Page title is : " + driver.getTitle());
	     
		
	       // Selecting the user ID from the dropdown
	        WebElement userIDDropdown = driver.findElement(By.id("txtUserID"));
	        Select userIDSelect = new Select(userIDDropdown);
	        userIDSelect.selectByIndex(7); // Index is 0-based, so 8th option is index 7

	        // Enter the password
	        WebElement password = driver.findElement(By.id("txtPassword"));
	        password.sendKeys("qaramesh");

	        Thread.sleep(3000);
	        
	        // Click the login button
	        WebElement login = driver.findElement(By.id("btnSave"));
	        login.click();

	        // Validate the title
	        
		      System.out.println("Page title is : " + driver.getTitle());
		      
	        String actTitle = driver.getTitle();
	        if (actTitle.equals("Your Store")) {
	            System.out.println("Page Title: "+ driver.getTitle()+ "- Test Passed - Right Title");
	        } else {
	            System.out.println("Page Title: " + driver.getTitle()+ "- Test Failed - Wrong Title");
	        }

	        // Close the browser
	        driver.quit();
	    }
	}