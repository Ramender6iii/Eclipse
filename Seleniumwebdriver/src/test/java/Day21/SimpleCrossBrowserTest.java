package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleCrossBrowserTest {

    public static void main(String[] args) {
        String loginUrl = "https://demo.opencart.com";
        
        // Test on Chrome
        boolean chromeResult = openPageInBrowser("chrome", loginUrl);
        if (chromeResult) {
            System.out.println("Chrome: Successfully opened the login page.");
        } else {
            System.out.println("Chrome: Failed to open the login page.");
        }

        // Test on Firefox
        boolean firefoxResult = openPageInBrowser("firefox", loginUrl);
        if (firefoxResult) {
            System.out.println("Firefox: Successfully opened the login page.");
        } else {
            System.out.println("Firefox: Failed to open the login page.");
        }
    }

    public static boolean openPageInBrowser(String browser, String url) {
        WebDriver driver = null;
        try {
            if (browser.equalsIgnoreCase("chrome")) {
                //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                driver = new FirefoxDriver();
            } else {
                System.out.println("Unsupported browser: " + browser);
                return false;
            }

            driver.get(url);

            // Check if the page title contains the expected text
            String pageTitle = driver.getTitle();
            // Assuming the login page has a title containing "Login"
            return pageTitle.contains("Your Store");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
