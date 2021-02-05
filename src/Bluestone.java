import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'form-text typeahead')]")).sendKeys("Diamond Rings",Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@alt,'The Karika statement Ring')]")).click();
		Set<String>wins= driver.getWindowHandles();	
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//input[contains(@class,'exclusive btn style2 btn-block addToCart')]")).click();
		WebElement error = driver.findElement(By.xpath("//div[contains(@class,'formErrorContent')]"));
		System.out.println(error.getText());

	}

}
