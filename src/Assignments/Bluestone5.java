/*
 Scenario 5:
 1: Open browser
 2: Load URL
 3: Move to Gold coin
 4: Go to Lakshmi gold coin and select 10gm
 5: Verify 10gm coin is displaying or not
 6: close browser
 */
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone5 
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
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-10gms,m']")).click();
		WebElement goldCoin = driver.findElement(By.xpath("//h1[@class='title-5']"));
		if(goldCoin.isDisplayed())
			System.out.println(goldCoin.getText());
		else
			System.out.println("Gold coin not displayed.....");

		Thread.sleep(2000);
		driver.quit();
	}

}
