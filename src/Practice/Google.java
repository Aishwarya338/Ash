package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google 
{
        
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("C++",Keys.ENTER);
		//List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		List<WebElement> pages = driver.findElements(By.xpath("//span[@class='SJajHc NVbCr']"));
		for(WebElement menuName : pages)
		{
			String mName = menuName.getText();
			System.out.println(mName);
		}
		//Comment by Github....:)
	    /*int pageCount=pages.size();
	    System.out.println(pageCount);
		for(int i=0;i<pageCount;i++)
	    {
	     	   driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
	     	   pageCount++;
	    }
	    */
	}

}
