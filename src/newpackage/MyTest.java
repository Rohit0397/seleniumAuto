package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	System.out.print("Chrome Launched");
	driver.get("http://dev.trailchallenger.support/login");
	Thread.sleep(6000);
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement emailField = driver.findElement(By.xpath("//input[@autocomplete='username']"));
	String eml = "trailchallenger@yopmail.com";
	emailField.sendKeys(eml);
	Thread.sleep(3000);
	WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	String pass = "12345678";
	passwordField.sendKeys(pass);
	Thread.sleep(2000);
	WebElement checkField = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkField.click();
	Thread.sleep(2000);
	WebElement loginField = driver.findElement(By.xpath("//button[@class='btn btn-secondary px-4']"));
	loginField.click();
	
}

}
