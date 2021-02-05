import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("ABC");
		a.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
