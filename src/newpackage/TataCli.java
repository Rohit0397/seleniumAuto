package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataCli {
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	System.out.print("Chrome Launched");
	driver.get("https://www.tatacliq.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement noClick = driver.findElement(By.xpath("//button[@class='No thanks']"));
	noClick.click();
	
	Thread.sleep(5000);
	
	//WebElement crossClick = driver.findElement(By.xpath("//a[@href=\"javascript:void(0);\"]"));
	//crossClick.click();
	
	//Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("window.scrollTo(0, window.innerHeight/2);");
	
    Thread.sleep(3000);
	
    // Select the options
    WebElement suggestion = driver.findElement(By.xpath("//img[@class='Image__actual'][@src='//assets.tatacliq.com/medias/sys_master/images/50557264068638.jpg']"));
    suggestion.click();
	
}

}
