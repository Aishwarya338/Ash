import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java",Keys.ENTER);
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		//System.out.println(driver.findElement(By.).getText());
		Thread.sleep(2000);
		searchBar.clear();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testng",Keys.ENTER);
        
	}

}
