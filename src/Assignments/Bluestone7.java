/*
Scenario 7:
 1: Open browser
 2: Load URL
 3: Go to search and search for rings
 4: Move cursor to Delivery Time
 5: Get the count of Next Day Delivery
 6: Close the browser
*/
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Bluestone7 
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
        WebElement delivery = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/descendant::span[text()='Delivery Time']"));
        Actions a = new Actions(driver);
        a.moveToElement(delivery).build().perform();
        Thread.sleep(2000);
        WebElement count = driver.findElement(By.xpath("//span[@data-tagcategory='Delivery Time']/span[@class='items-count']"));
        System.out.println("Count of Next Day Delivery:"+count.getText());
        Thread.sleep(2000);
        driver.quit();
	}
}
