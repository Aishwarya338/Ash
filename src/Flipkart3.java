//Fetching sub menus
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
	    Actions a =new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menuName : menus)
		{
			String mName = menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			//List<WebElement> subMenus = driver.findElements(By.xpath("//div[@class='_1QrT3s']/descendant::a"));
			List<WebElement> subMenus = driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::div/descendant::div[@class='_1fwVde']/a"));
			for(WebElement subMenuName : subMenus)
			{
				System.out.println(subMenuName.getText());
			}
			System.out.println("---------------------------------");
			Thread.sleep(2000);
		}
	}
}
