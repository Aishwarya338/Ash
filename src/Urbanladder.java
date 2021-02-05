import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		//driver.findElement(By.xpath("//a[contains(.,'Track Order')]")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sofa",Keys.ENTER);
		//driver.findElement(By.xpath("//img[@title='Weston Half Leather Sofa (Wine Italian Leather)']")).click();
		WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sale.getText());
		

	}

}
