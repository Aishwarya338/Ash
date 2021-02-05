import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement admin = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println("Username: "+admin.getText());
		WebElement manager = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println("Password: "+manager.getText());
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(admin.getText());
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(manager.getText());
		
		WebElement login= driver.findElement(By.xpath("//a/div[contains(.,'Login')]"));
		login.click();

		/*
		driver.findElement(By.linkText("Forgot your password?")).click();	
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String>wins= driver.getWindowHandles();	
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.getTitle());
		*/
	}

}

