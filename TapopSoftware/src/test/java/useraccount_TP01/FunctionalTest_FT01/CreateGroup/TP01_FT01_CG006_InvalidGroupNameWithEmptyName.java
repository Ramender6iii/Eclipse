package useraccount_TP01.FunctionalTest_FT01.CreateGroup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TP01_FT01_CG006_InvalidGroupNameWithEmptyName {

    private static WebDriver driver;
    
    public static class GroupManagementTest {
    	private static final String GROUP_NAME = "";

    public static void main(String[] args) throws Exception {
        // Set ChromeOptions to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        try {
            // Navigate to the login page
            driver.get("http://192.168.5.179/");
            System.out.println("Page title: " + driver.getTitle());

            // Log in to the application and create a group
            loginAndCreateGroup(driver, "admin", "Admin123");

        } finally {
            // Close the driver when done to free up resources
            driver.quit();
        }
    }

    // Method to handle login process
    private static void login(WebDriver driver, String usernameText, String passwordText) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the login screen to load
        Thread.sleep(3000); // Adjust if needed for your application

        // Wait for the login button and click it
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin")));
        loginButton.click();

        // Locate and enter the username
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-user")));
        username.sendKeys(usernameText);

        // Locate and enter the password
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-pass")));
        password.sendKeys(passwordText);

        // Locate and click the login submit button
        WebElement loginSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginSubmitButton.click();
    }

    // Method to check if login was successful by looking for the "login name" link
    private static void checkLoginSuccess(WebDriver driver) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait up to 20 seconds

        try {
            // Locate the button that contains the username (using the class or id)
            WebElement loginUserButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenu1"))); // Locate the button by its id

            // Get the username from the span element with class 'btn-sign-text'
            WebElement usernameSpan = loginUserButton.findElement(By.className("btn-sign-text"));

            // Check if the username displayed matches the expected value
            String loggedInUsername = usernameSpan.getText();
            
            if ("admin".equals(loggedInUsername)) {
                System.out.println("Login successful! Logged in as: " + loggedInUsername);
            } else {
                System.out.println("Login failed: Unexpected username.");
                
            }

        } catch (Exception e) {
            System.out.println("Login failed: Username not found.");
            
        }
    }
   
    // Combined method: login and create group
    private static void loginAndCreateGroup(WebDriver driver, String usernameText, String passwordText) throws Exception {
        login(driver, usernameText, passwordText);  // First, login
        checkLoginSuccess(driver);  // Verify login success
        createGroup(driver);  // Create the group
      //  deleteGroup(driver);  // After creating the group, delete it
    }

    // Method to create a group (after login)
    public static void createGroup(WebDriver driver) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to the group creation page
        WebElement utility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu-content']/ul/li[8]/a")));
        utility.click();

        WebElement userAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu-content']/ul/li[8]/ul/li[1]/a/span")));
        userAccount.click();

        WebElement group = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myPjax']/ul/li[2]/a/strong")));
        group.click();

        // Add new group
        WebElement newGroupButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnNewGroup")));
        newGroupButton.click();

        WebElement addGroupName = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtGroupName")));
        addGroupName.sendKeys(GROUP_NAME);

        WebElement saveGroupButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnGroupSave")));
        saveGroupButton.click();

         // Wait and check if the error message is displayed
         try {
             WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessageGroup")));
             
             if (errorMessage.isDisplayed()) {
                 System.out.println("Error message displayed: " + errorMessage.getText());
             }
         } catch (Exception e) {
             System.out.println("No error message displayed.");
         }

         // Optionally, handle alert if one appears (if your app uses alerts)
         try {
             Alert alert = wait.until(ExpectedConditions.alertIsPresent());
             System.out.println("Alert message: " + alert.getText());
             alert.accept();  // Accept the alert to continue
         } catch (Exception e) {
             System.out.println("No alert was triggered.");
         }
    }
}
}
