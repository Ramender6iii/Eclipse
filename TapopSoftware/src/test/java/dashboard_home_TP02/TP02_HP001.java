package dashboard_home_TP02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	            
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            String cookies = (String) js.executeScript("return document.cookie;");
	            System.out.println("Cookies: " + cookies);
	            
	            
	            WebElement link = driver.findElement(By.xpath("//*[@id='includedContent']/div/div[4]/ul/li[1]/a"));
	            String hrefValue = link.getAttribute("href");
	            
	            // Print the value of the 'href' attribute
	            System.out.println("The href attribute value is: " + hrefValue);
	            
	            WebElement img = driver.findElement(By.xpath("/html/body/nav/a/img")); 
	            
	           // Check if the image is displayed
	            boolean isDisplayed = img.isDisplayed();

	            // Print the result
	            if (isDisplayed) {
	            System.out.println("Top Image title: The image is displayed.");
	            } else {
	            System.out.println("Top Image title: The image is not displayed.");
	            }

	          
	          // Find all 'a' elements within 'nav-item' class
	          List<WebElement> navLinks = driver.findElements(By.xpath("//li[@class='nav-item']/a"));

	          // Check if each element is enabled and print the result
	          for (WebElement link1 : navLinks) {
	          boolean isEnabled = link1.isEnabled();
	          //System.out.println("Nav item: " + link1.getText() + " | Href: " + link1.getAttribute("href") + " | is enabled: " + isEnabled);
	          System.out.println("Nav item: " + link1.getText() + " is enabled: " + isEnabled);
	          }
	          	                    	
	          // Close the driver when done
	          driver.quit();
	            }
	        }
		
	}
