/*
Scenario 6:
 1: Open browser
 2: Load URL
 3: Go to search and search for rings
 4: Move cursor to price
 5: Get the count of below 10000 Rs.
 6: Close the browser
*/
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("Rings",Keys.ENTER);
        WebElement price = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/descendant::span[text()='Price']"));
        Actions a = new Actions(driver);
        a.moveToElement(price).build().perform();
        WebElement count = driver.findElement(By.xpath("//span[contains(.,' Below ')]/span[@class='items-count']"));
        /*
        Or after clicking below 10000 Rs.
        driver.findElement(By.xpath("//span[@data-displayname='rs 10000 to rs 20000']")).click();
        List<WebElement> count = driver.findElements(By.xpath("//img[@class='hc img-responsive center-block']"));
        System.out.println(count.size());
        */
        System.out.println("Count of Below 10,000 Rs.:"+count.getText());
        Thread.sleep(2000);
        driver.quit();
	}

}
