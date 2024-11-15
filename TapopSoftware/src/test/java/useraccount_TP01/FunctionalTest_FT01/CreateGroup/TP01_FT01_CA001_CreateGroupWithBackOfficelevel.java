package useraccount_TP01.FunctionalTest_FT01.CreateGroup;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TP01_FT01_CA001_CreateGroupWithBackOfficelevel {

    private static WebDriver driver;

    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        try {
            // Navigate to the login page
            driver.get("http://192.168.5.179/");
            System.out.println("Page title: " + driver.getTitle());

            // Log in to the application
            login(driver, "admin", "Admin123");

            // Create a new group
            createGroup(driver);

        } finally {
            // Close the driver when done
            driver.quit();
        }
    }

    // Method to handle login process
    private static void login(WebDriver driver, String usernameText, String passwordText) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Thread.sleep(3000); // without Thread.sleep login screen does not appear
        // Wait for the login button and click it
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin")));
        loginButton.click();

        // Locate and enter username
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-user")));
        username.sendKeys(usernameText);

        // Locate and enter password
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-pass")));
        password.sendKeys(passwordText);

        // Locate the Submit button and click it
        WebElement loginSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginSubmitButton.click();
    }

    // Method to create a group
    public static void createGroup(WebDriver driver) throws InterruptedException {
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
        addGroupName.sendKeys("new group");

        WebElement saveGroupButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnGroupSave")));
        saveGroupButton.click();

        WebElement saveGroupLevelButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("save")));
        saveGroupLevelButton.click();

        // Handle the alert (accept the alert)
        Alert alert = driver.switchTo().alert();
        alert.accept(); // This clicks the "OK" button on the alert

        // Wait for the page refresh after saving, then click the back button using JavaScript
        WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='w0']/div/div[3]/div[2]/a")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", backButton);

        // Check if the group has been created by looking for the group name in the list
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//td[contains(text(),'new group')]")));
            System.out.println("Group created successfully!");
        } catch (Exception e) {
            System.out.println("Group creation failed.");
        }

        // Navigate back to the group management page to delete the group
        WebElement group2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myPjax']/ul/li[2]/a/strong")));
        group2.click();

        // Find the group row by its name and click the delete button in the same row
        WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[td[text()='new group']]/td/a[@class='btnDeleteGroup']")));
        deleteButton.click();

        WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnModalConfirmSave']")));
        confirmDeleteButton.click();

        // Wait for the group to be deleted (check if it's no longer visible)
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//table//td[contains(text(),'new group')]")));
            System.out.println("Group deleted successfully!");
        } catch (Exception e) {
            System.out.println("Group deletion failed.");
        }
    }
}