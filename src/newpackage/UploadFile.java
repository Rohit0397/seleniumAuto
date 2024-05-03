package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");
        
        String baseUrl = "https://demo.guru99.com/test/upload/";
        
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        
        Thread.sleep(2000);

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("/home/appinventiv/Downloads/IMG_20220916_214417_173 (1).jpg");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}