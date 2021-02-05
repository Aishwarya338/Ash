//Get Menu list
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		for(WebElement menuName : menus)
		{
			String mName = menuName.getText();
			System.out.println(mName);
			act.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			List<WebElement> subMenu = driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for(WebElement subMenuName : subMenu)
			{
				System.out.println(subMenuName.getText());
			}
			System.out.println("------------------------------");
			Thread.sleep(2000);
		}
       
	}

}
