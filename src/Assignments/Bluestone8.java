/*
Scenario 8:
 1: Open browser
 2: Load URL
 3: Go to search and search for rings
 4: Move cursor to Metal
 5: Get the count of Platinum
 6: Close the browser
*/
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("Rings",Keys.ENTER);
        Thread.sleep(2000);
        WebElement metal = driver.findElement(By.xpath("//span[text()='Metal']"));
        Actions a = new Actions(driver);
        a.moveToElement(metal).build().perform();
        Thread.sleep(2000);
        WebElement count = driver.findElement(By.xpath("//span[text()=' Platinum ']/span[@class='items-count']"));
        System.out.println("Count of Platinum:"+count.getText());
        Thread.sleep(2000);
        driver.quit();
	}
}
