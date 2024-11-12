package Day21;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demo.opencart.com");
	driver.manage().window().maximize();
	
	//example locater by name
	//driver.findElement(By.name("search")).sendKeys("Mac");
		
	//example locator by id & is displayed use boolean true/false
	//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
	//System.out.println(logoDisplaystatus);
	
	//linktext & partialLinkText
	//driver.findElement(By.linkText("Tablets")).click();//full text
	//driver.findElement(By.partialLinkText("Table")).click();
	//partiallinktext not preferable due to might have multiple item
	
	//find multiple web element
	//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
	//System.out.println("total number of header links:"+ headerLinks.size());
	
	//find multiple web element using tag name
	//List<WebElement> links=driver.findElements(By.tagName("a"));
	//System.out.println("total number of links:"+ links.size());
	
	//List<WebElement> images=driver.findElements(By.tagName("img"));
//	System.out.println("total number of images:"+ images.size());
	
	
    }			
}
