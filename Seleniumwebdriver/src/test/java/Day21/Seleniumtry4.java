package Day21;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumtry4 {

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
        
        Thread.sleep(5000);
        
        System.out.println("Page title is : " + driver.getTitle());
        
        // Get all radio buttons after logging in
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@type='radio']"));

        // Check if there are any radio buttons
        if (!radioButtons.isEmpty()) {
            for (WebElement radioButton : radioButtons) {
                String radioName = radioButton.getAttribute("Value"); // Get the name of the radio button

                if (!radioButton.isSelected()) {
                    if ("Failure_Analysis".equals(radioName)) {
                        //System.out.println("Skipped clicking: " + radioName);
                        continue; // Skip clicking if the name is Failure_Analysis
                    }
                    radioButton.click(); // Click the radio button
                    System.out.println("Clicked radio button: " + radioName);
                    
                    // Delay before moving to the next radio button
                    Thread.sleep(2000); // Delay for 2 seconds (adjust as needed)
                }
            }

            // Click the Failure_Analysis radio button after processing others
            for (WebElement radioButton : radioButtons) {
                if ("Failure_Analysis".equals(radioButton.getAttribute("Value")) && !radioButton.isSelected()) {
                    radioButton.click();
                    System.out.println("Clicked Failure_Analysis radio button.");
                    break; // Exit the loop after clicking
                }
            }
        } else {
            System.out.println("No radio buttons found.");
        }

        // Validate the title
        String actTitle = driver.getTitle();
        if (actTitle.equals("QA New Entry")) {
            System.out.println("Page Title: " + driver.getTitle() + " - Test Passed - Right Title");
        } else {
            System.out.println("Page Title: " + driver.getTitle() + " - Test Failed - Wrong Title");
        }

        // Close the browser
        //driver.quit(); // Uncomment to close the browser
    }
}
