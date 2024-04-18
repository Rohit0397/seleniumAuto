package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");

        // Initialize the ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page containing the drag and drop elements
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Locate the source element (file to be dragged)
        WebElement sourceElement = driver.findElement(By.xpath("//li[@class='block14 ui-draggable'][@data-id='5'][@id='credit2']"));
       
        // Locate the target element (where the file will be dropped)
        WebElement targetElement = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Perform drag and drop operation
        actions.dragAndDrop(sourceElement, targetElement).build().perform();

        // Close the browser
     
    }
}

