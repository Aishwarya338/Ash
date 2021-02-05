/*
Scenario:
 1: Open browser
 2: Load URL
 3: Go to search and search for Java
 4: Click on Next button until the last page arrives
*/
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java",Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		boolean b = ele.isDisplayed();
		while(b)
		{
			driver.findElement(By.xpath("//span[contains(text(),'Next')]/parent::a")).click();
			//b=driver.findElement(By.xpath("//span[contains(text(),'Next')]/parent::a")).isDisplayed();
		}
	}

}
