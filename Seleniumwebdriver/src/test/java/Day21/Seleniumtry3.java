package Day21;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtry3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://rnd.digisingapore.com/QCWebsite/QA_Form");
        System.out.println("Page title is : " + driver.getTitle());

        // Get all radio buttons
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@type='radio']"));

        // Check if there are any radio buttons
        if (!radioButtons.isEmpty()) {
            // Click the last radio button
            WebElement lastRadioButton = radioButtons.get(radioButtons.size() - 1); // Get the last one
            if (!lastRadioButton.isSelected()) {
                lastRadioButton.click();
                System.out.println("Selected the last radio button: " + lastRadioButton.getAttribute("name"));
            } else {
                System.out.println("The last radio button is already selected.");
            }
        } else {
            System.out.println("No radio buttons found.");
        }

        // Validate the title
        String actTitle = driver.getTitle();
        if (actTitle.equals("Your Store")) {
            System.out.println("Page Title: " + driver.getTitle() + " - Test Passed - Right Title");
        } else {
            System.out.println("Page Title: " + driver.getTitle() + " - Test Failed - Wrong Title");
        }

        // Close the browser
        //driver.quit();
    }
}