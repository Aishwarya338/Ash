import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for(WebElement suggName : sugg)
		{
			System.out.println(suggName.getText());
		}
		sugg.get(2).click();
	}

}
