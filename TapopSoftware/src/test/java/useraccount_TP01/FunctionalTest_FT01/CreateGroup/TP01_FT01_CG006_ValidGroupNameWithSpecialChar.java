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

public class TP01_FT01_CG006_ValidGroupNameWithSpecialChar {

    private static WebDriver driver;

    // Class-level variables for credentials
    private static final String USERNAME = "admin";           // Username for login
    private static final String PASSWORD = "Admin123";       // Password for login
    private static final String GROUP_NAME = "New Group @ 0102";     // Group name (in capital letter)

    // GroupManagementTest class to handle the test flow
    public static class GroupManagementTest {

        public static void main(String[] args) throws Exception {
            // Set ChromeOptions to disable notifications
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");

            driver = new ChromeDriver(options);

            try {
                // Navigate to the login page and login
                driver.get("http://192.168.5.179/");
                loginAndCreateGroup(driver, USERNAME, PASSWORD);

            } finally {
                // Close the driver when done
                driver.quit();
            }
        }

        // Method to handle login process using class-level variables
        private static void login(WebDriver driver, String usernameText, String passwordText) throws Exception {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the login screen to load
            Thread.sleep(3000); // Adjust if needed for your application

            // Wait for and click the login button
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin")));
            loginButton.click();

            // Enter username and password
            WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-user")));
            username.sendKeys(usernameText);  // Use class-level USERNAME variable

            WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-pass")));
            password.sendKeys(passwordText);  // Use class-level PASSWORD variable

            // Submit login
            WebElement loginSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            loginSubmitButton.click();
        }

        // Combined method: login and create group
        private static void loginAndCreateGroup(WebDriver driver, String usernameText, String passwordText) throws Exception {
            login(driver, usernameText, passwordText);  // First, login
            checkLoginSuccess(driver, usernameText);  // Verify login success using the provided username
            createGroup(driver);  // Create the group
            deleteGroup(driver);  // After creating the group, delete it
        }
        
        // Method to check login success
        private static void checkLoginSuccess(WebDriver driver, String expectedUsername) throws Exception {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            try {
                WebElement loginUserButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenu1")));
                WebElement usernameSpan = loginUserButton.findElement(By.className("btn-sign-text"));
                String loggedInUsername = usernameSpan.getText();

                // Check if the logged-in username matches the expected username
                if (expectedUsername.equals(loggedInUsername)) {
                    System.out.println("Login successful! Logged in as: " + loggedInUsername);
                } else {
                    System.out.println("Login failed: Unexpected username. Expected: " + expectedUsername + ", Found: " + loggedInUsername);
                }

            } catch (Exception e) {
                System.out.println("Login failed: Username not found.");
            }
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
    
        // Check if the group has been created by looking for the group name in the list
        try {
        WebElement groupPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myPjax']/ul/li[2]/a/strong")));
        groupPage.click();
        WebElement createdGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='group-grid']/table/tbody//td[contains(text(),'"+ GROUP_NAME +"')]")));
        System.out.println("Group created successfully! Group name: " + createdGroup.getText());
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
