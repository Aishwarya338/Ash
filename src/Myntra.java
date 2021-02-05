//Get Menu list
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		Actions act=new Actions(driver);
		for(WebElement menuName:menu)
	    {
	    	System.out.println(menuName.getText());
			act.moveToElement(menuName).build().perform();
	    }
	}

}
