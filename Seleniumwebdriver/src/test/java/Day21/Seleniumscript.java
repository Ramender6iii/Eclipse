package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.opencart.com");
	      
	      /*
	      // getTitle() to obtain page title
	      System.out.println("Page title is : " + driver.getTitle());
	      */
		
	      //validate title should be "your Store"
	      String act_title=driver.getTitle();
	      
	      if(act_title.equals("Your Store")) {
	    	  System.out.println("Test Passed");
	      }else {
	    	  System.out.println("Test Failed");
	      }
	    	  
	}

	}

