package useraccount_TP01.FunctionalTest_FT01.CreateGroup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TP01_FT01_CG002_ValidGroupNameWithSmallLetter {

    private static WebDriver driver;
    
    public static class GroupManagementTest {
    	private static final String GROUP_NAME = "newgroup";

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
        deleteGroup(driver);  // After creating the group, delete it
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

        WebElement saveGroupLevelButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("save")));
        saveGroupLevelButton.click();

        // Handle the alert (accept the alert)
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Wait for the page refresh after saving, then click the back button using JavaScript
        WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='w0']/div/div[3]/div[2]/a")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", backButton);
    
         //another method to search group creation
        /*   // Check if the group has been created by looking for the group name in the list
    	WebElement groupName = wait.until(new Function<WebDriver, WebElement>() {
        public WebElement apply(WebDriver driver) {
            // Find the element containing the group name
            return driver.findElement(By.xpath("//table//td[contains(text(),'New Group 0102')]"));
        }
    });


    // If found, print success message
    if (groupName != null) {
        System.out.println("Group created successfully!");
    } else {
        System.out.println("Group creation failed.");
    }
    }*/
    
    // Check if the group has been created by looking for the group name in the list
    try {
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='group-grid']/table/tbody//td[contains(text(),'"+ GROUP_NAME +"')]")));
        System.out.println("Group created successfully!");
    } catch (Exception e) {
        System.out.println("Group creation failed.");
    }
    }
    
    
    
    // Method to delete the group (after creation)
    public static void deleteGroup(WebDriver driver) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate back to the group management page
        WebElement groupPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myPjax']/ul/li[2]/a/strong")));
        groupPage.click();

        // Find the group row by its name and click the delete button in the same row
        WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[td[text()='"+ GROUP_NAME +"']]/td/a[@class='btnDeleteGroup']")));
        deleteButton.click();

        // Confirm the deletion in the modal
        WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnModalConfirmSave']")));
        confirmDeleteButton.click();

        // Wait for the group to be deleted (check if it's no longer visible)
        try {
        	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='group-grid']/table/tbody//td[contains(text(),'"+ GROUP_NAME +"')]")));
            System.out.println("Group deleted successfully!");
        } catch (Exception e) {
            System.out.println("Group deletion failed.");
        }
    }
    }
}
