package dashboard_home_TP02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TP02_HP001 {

	    private static WebDriver driver;


	    // GroupManagementTest class to handle the test flow
	    public static class GroupManagementTest {

	        public static void main(String[] args) throws Exception {
	            // Set ChromeOptions to disable notifications
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--disable-notifications");

	            driver = new ChromeDriver(options);
	            driver.get("http://192.168.5.179/");

	            System.out.println(driver.getTitle());
	            
	            WebElement img = driver.findElement(By.xpath("/html/body/nav/a/img")); 
	            
	         // Check if the image is displayed
	            boolean isDisplayed = img.isDisplayed();

	            // Print the result
	            if (isDisplayed) {
	            System.out.println("Top Image title: The image is displayed.");
	            } else {
	            System.out.println("Top Image title: The image is not displayed.");
	            }



	                // Close the driver when done
	                driver.quit();
	            }
	        }
		
	}
