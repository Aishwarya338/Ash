//Get stores location
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Urbanladder2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		driver.findElement(By.partialLinkText("Stores")).click();
		Thread.sleep(2000);
		List<WebElement> menus = driver.findElements(By.xpath("//h3[@class='_3JJeW']"));
		for(WebElement menuName : menus)
	    {
	    	System.out.println(menuName.getText());
	    }
	}
}
