//To Cancel the pop-up

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
	}
}
