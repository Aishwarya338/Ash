import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement jwel = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions a = new Actions(driver);
		a.moveToElement(jwel).build().perform();
		driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
        driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).click();
        Set<String>wins= driver.getWindowHandles();	
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		driver.findElement(By.xpath("//li[@onclick='selectRingSize(this)']/descendant::span[contains(.,'2-2(2 2/16\")')]")).click();
		driver.findElement(By.xpath("//input[@class='exclusive btn style2 btn-block addToCart']")).click();
		WebElement text = driver.findElement(By.xpath("//a[@title='The Udith Kada For Him']"));
		System.out.println(text.getText());
	}

}
