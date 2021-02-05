/*
Scenario 9:
 1: Open browser
 2: Load URL
 3: Go to search and search for rings
 4: Click on More Filters
 5: Get the count of 22k of Gold Purity
 6: Close the browser
*/
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone9 
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
        driver.findElement(By.xpath("//span[text()='More Filters']")).click();
        Thread.sleep(2000);
        WebElement count = driver.findElement(By.xpath("//span[text()=' 22k ']/span[@class='items-count']"));
        System.out.println("Count of 22k:"+count.getText());
        Thread.sleep(2000);
        driver.quit();
	}
}
