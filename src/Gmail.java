import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://developers.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'  Sign in')]")).click();
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("kochaleaishwarya5@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345");
		
		driver.findElement(By.id("passwordNext")).click();

	}

}
