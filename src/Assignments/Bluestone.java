/*
 Scenario 1:
 1: Open browser
 2: Load URL
 3: Move to Gold coin
 4: Go to plain gold coin and select 20gm
 5: Verify 20gm coin is displaying or not
 */
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement coin = driver.findElement(By.xpath("//a[contains(.,'Coins ')]"));
		Actions a = new Actions(driver);
		a.moveToElement(coin).build().perform();
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
		WebElement goldCoin = driver.findElement(By.xpath("//h1[@class='title-5']"));
		if(goldCoin.isDisplayed())
			System.out.println(goldCoin.getText());
	}

}
