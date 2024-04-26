package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TataCli {
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	System.out.print("Chrome Launched");
	driver.get("https://www.tatacliq.com/");
	Thread.sleep(6000);
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement searchField = driver.findElement(By.xpath("//div[@class ='Input2__box Input2__base']/input[@id='search-text-input']"));
	String txt = "Men";
	searchField.sendKeys(txt);
	Thread.sleep(2000);
	
	/* Wait for the suggestions to appear
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='SearchPage__searchResultsWithPopularProduct']")));
	*/
	
    // Select the first suggestion from the drop down options
    WebElement suggestion = driver.findElement(By.xpath("//div[@class='SearchPage__back']//div[@class='SearchResultItem__base']//span[contains(text(),'men') and contains(@class,'')]/following-sibling::span[contains(text(),'s tshirt') and contains(@class,'SearchResultItem__bolder')]"));
    suggestion.click();
	
}

}
