package Day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumcript3 {

	public static void main(String[] args) {
				
		WebDriver driver = new ChromeDriver();
	
      driver.get("https://demo.opencart.com");
      //driver.manage().window().maximize();
      
      //name
      driver.findElement(By.name("search")).sendKeys("Mac");
      
      //id
     // boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
      //System.out.println(logoDisplaystatus);
      
	
      //validate title should be "your Store"
      //String act_h1=driver.getTitle();
      
      
      //linktest & partialLink Text
     // driver.findElement(By.linkText("Tablets")).click();
      driver.findElement(By.partialLinkText("Table")).click();
      
     //if(By.name.equals("Mac")) {
    //	  System.out.println("Test Passed");
   //   }else {
    //	  System.out.println("Test Failed");
      
      
    //find multiple web element
  	List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
  	System.out.println("total number of header links:"+ headerLinks.size());
      }
    	  
}
