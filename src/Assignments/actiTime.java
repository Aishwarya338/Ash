//Check whether logout button is clickable or not
package Assignments;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class actiTime 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.xpath("//a/div[contains(.,'Login')]")).click();
		WebDriverWait ww = new WebDriverWait(driver,20);
		ww.until(ExpectedConditions.titleContains("Track"));
		WebElement logout = driver.findElement(By.xpath("//a[@id='logoutLink']"));
		System.out.println(logout.isEnabled());
		if(logout.isEnabled())
			logout.click();
	}
}
