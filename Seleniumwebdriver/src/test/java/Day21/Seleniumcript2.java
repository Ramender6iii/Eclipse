package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumcript2 {

	public static void main(String[] args) {
	
		//	//not required
		//System.setProperty("webdriver.chrome.driver","C:\\Software\\Selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	      //
		
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new EdgeDriver();
			//WebDriver driver = new FirefoxDriver();
		
	      driver.get("http://rnd.digisingapore.com/qcwebsite/");
	      
	      /*
	      // getTitle() to obtain page title
	      System.out.println("Page title is : " + driver.getTitle());
	      */
		
	      //validate title should be "your Store"
	      String act_title=driver.getTitle();
	      
	      if(act_title.equals("QC Website")) {
	    	  System.out.println("Title Test Passed");
	      }else {
	    	  System.out.println("Title Test Failed");
	      }
	    	  
	}

}
