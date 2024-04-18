package newpackage;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class ScreenShot {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Take screenshot and save it as a file
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            // Specify the location where you want to save the screenshot
            FileUtils.copyFile(screenshotFile, new File("/home/appinventiv/Desktop/testing/automationtesting/screenshot1.png"));
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }

        // Close the browser
        driver.quit();
    }
}

