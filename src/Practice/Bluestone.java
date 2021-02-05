package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : menus) 
		{
			String mName = menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			//List<WebElement> subMenus = driver.findElements(By.xpath("//a[@title='Rings']/parent::li/descendant::li/a"));
			List<WebElement> subMenus = driver.findElements(By.xpath("//a[contains(.,'Rings ')]/parent::li/descendant::li"));
			for (WebElement subMenuName : subMenus) 
			{
				System.out.println(subMenuName.getText());			}
		    }
		Thread.sleep(2000);
		
	}

}
