package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	System.out.print("Chrome Launched");
	driver.get("http://15.207.106.212:3000/");
	Thread.sleep(6000);
	driver.manage().window().maximize();
}


}
