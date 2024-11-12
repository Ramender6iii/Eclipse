package Day21;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Seleniumtry5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://rnd.digisingapore.com/QCWebsite/QA_Form");
        
        System.out.println("Page title is: " + driver.getTitle());
        
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
        
        System.out.println("Page title is: " + driver.getTitle());

        // Use WebDriverWait for elements to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Get all radio buttons after logging in
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@type='radio']"));
        HashSet<String> clickedRadioButtons = new HashSet<>(); // Set to track unique clicked radio buttons

        // Check if there are any radio buttons
        if (!radioButtons.isEmpty()) {
            for (WebElement radioButton : radioButtons) {
                String radioName = radioButton.getAttribute("value");

                // Wait until the radio button is clickable
                wait.until(ExpectedConditions.elementToBeClickable(radioButton));

                if (!radioButton.isSelected()) {
                    if ("Failure_Analysis".equals(radioName)) {
                        continue; // Skip clicking if the name is Failure_Analysis
                    }
                    radioButton.click();
                    System.out.println("Clicked radio button: " + radioName);
                    clickedRadioButtons.add(radioName); // Add to set to ensure uniqueness
                    
                    Thread.sleep(2000); // Delay before moving to the next radio button
                }
            }

            // Click the Failure_Analysis radio button after processing others
            for (WebElement radioButton : radioButtons) {
                if ("Failure_Analysis".equals(radioButton.getAttribute("value")) && !radioButton.isSelected()) {
                    wait.until(ExpectedConditions.elementToBeClickable(radioButton));
                    radioButton.click();
                    System.out.println("Clicked radio button: Failure_Analysis");
                    clickedRadioButtons.add("Failure_Analysis"); // Add to set for uniqueness
                    break; // Exit the loop after clicking
                }
            }

            // Wait for the Product_Test radio button to be clickable
            WebElement productTestRadioButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Product_Test']"))));
            productTestRadioButton.click();
            System.out.println("Clicked radio button: Product_Test");
            clickedRadioButtons.add("Product_Test"); // Add to set for uniqueness

            // Print total unique radio buttons clicked
            System.out.println("Total unique radio buttons clicked: " + clickedRadioButtons.size());

            // Wait for checkboxes to be present after clicking the last radio button
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']")));

            // Locate all rows containing checkboxes
            List<WebElement> rows = driver.findElements(By.xpath("//tr"));
            // Initialize a counter for checked checkboxes
            int checkedCount = 0;

            for (WebElement row : rows) {
                // Get the test name from the first <td>
                List<WebElement> testNameElements = row.findElements(By.xpath(".//td[@class='tg-0pky']"));
                
                // Ensure there are at least two <td> elements for name and checkbox
                if (testNameElements.size() >= 2) {
                    String testName = testNameElements.get(0).getText(); // Get the test name
                    WebElement checkbox = testNameElements.get(1).findElement(By.xpath(".//input[@type='checkbox']")); // Find checkbox in the second <td>

                    // Check if the checkbox exists and is clickable
                    if (checkbox != null) {
                        wait.until(ExpectedConditions.elementToBeClickable(checkbox)); // Wait for the checkbox to be clickable
                        if (!checkbox.isSelected()) {
                            checkbox.click(); // Click the checkbox if it's not checked
                            System.out.println("Checked a checkbox: " + testName); // Log the test name
                            checkedCount++; // Increment the counter
                        }
                    }
                }
            }

            // Print the total number of checkboxes checked only if any checkbox was checked
            if (checkedCount > 0) {
                System.out.println("Total checkboxes checked: " + checkedCount);
            } else {
                System.out.println("No checkboxes were checked.");
            }
            
            // Validate the title
            String actTitle = driver.getTitle();
            if (actTitle.equals("QA New Entry")) {
                System.out.println("Page Title: " + driver.getTitle() + " - Test Passed - Right Title");
            } else {
                System.out.println("Page Title: " + driver.getTitle() + " - Test Failed - Wrong Title");
            }

        } else {
            System.out.println("No radio buttons found.");
        }
        
        // Close the browser
        driver.quit(); // Uncomment to close the browser
        
    }
}
