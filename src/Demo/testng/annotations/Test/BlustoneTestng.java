package Demo.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlustoneTestng 
{
	WebDriver driver;
	@BeforeMethod
	public void beforeM()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void tc_1()
	{
		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("Rings",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='The Jhonita Two Finger Ring']")).click();
		Set<String>wins= driver.getWindowHandles();	
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		WebElement ring = driver.findElement(By.xpath("//h1[@class='title-5']"));
	    System.out.println(ring.getText());
	}
	@Test
	public void tc_2()
	{
		WebElement coin = driver.findElement(By.xpath("//a[contains(.,'Coins ')]"));
		Actions a = new Actions(driver);
		a.moveToElement(coin).build().perform();
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
		WebElement goldCoin = driver.findElement(By.xpath("//h1[@class='title-5']"));
		if(goldCoin.isDisplayed())
		   System.out.println(goldCoin.getText());
	}
	@Test
	public void tc_3()
	{
		WebElement cart = driver.findElement(By.xpath("//span[@class='icon-img hs cart-icon']"));
		if(cart.isEnabled())
			cart.click();
		WebElement cartCount = driver.findElement(By.xpath("//span[@class='cart-count']"));
		System.out.println("Cart Items: "+cartCount.getText());
	}
	@Test
	public void tc_4()
	{
		WebElement gift = driver.findElement(By.xpath("//li[@class='menuparent gift-menu']"));
		Actions a = new Actions(driver);
		a.moveToElement(gift).build().perform();
		driver.findElement(By.xpath("//span[contains(.,'Birthday')]")).click();
		WebElement tags = driver.findElement(By.xpath("//div[@class='filtered-data']"));
		System.out.println(tags.getText());
	}
	@Test
	public void tc_5()
	{
		driver.findElement(By.xpath("//li[@class='store-block']")).click();
		WebElement stores = driver.findElement(By.xpath("//ul[@class='side-bar']"));
		System.out.println(stores.getText());
	}
	@AfterMethod
	public void afterM()
	{
		driver.quit();
	}

}
