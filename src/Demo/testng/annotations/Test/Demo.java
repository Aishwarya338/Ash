package Demo.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo 
{
	WebDriver driver;
    @BeforeMethod
    public void beforeM()
    {
    	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
    }
    
	@Test
	public void tc_1() 
	{
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java",Keys.ENTER);
		System.out.println("tc1");
	}
	@Test
	public void tc_2() 
	{
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testNG",Keys.ENTER);
		System.out.println("tc2");
	}
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
}
