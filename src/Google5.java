import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google5 
{
	public static void main(String[] args) throws InterruptedException, NoSuchElementException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("c",Keys.ENTER);
		boolean b = driver.findElements(By.xpath("//tr[@jsname='TeSSVd']/td")).isEmpty();
		while(b==false)
		{
	     	   driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
		}	
	}

}
