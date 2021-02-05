/*
Scenario 10:
 1: Open browser
 2: Load URL
 3: Go to search and search for rings
 4: Go to gender
 5: Get the count of Women
 6: Close the browser
*/
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("Coins",Keys.ENTER);
        Thread.sleep(2000);
        WebElement gender = driver.findElement(By.xpath("//span[text()='Gender']"));
        Actions a = new Actions(driver);
        a.moveToElement(gender).build().perform();
        Thread.sleep(2000);
        WebElement count = driver.findElement(By.xpath("//span[text()=' Women ']/span[@class='items-count']"));
        System.out.println("Count of Women:"+count.getText());
        Thread.sleep(2000);
        driver.quit();
	}
}
