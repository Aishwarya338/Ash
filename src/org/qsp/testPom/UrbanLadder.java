package org.qsp.testPom;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.UrbanLadderHome;

public class UrbanLadder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		UrbanLadderHome uh = new UrbanLadderHome(driver);
		uh.closeClick();
        Thread.sleep(2000);
        uh.livingMouseOver(driver);
        uh.fabricSofaSetsClick();
        uh.sofaClick();
        Set<String>wins= driver.getWindowHandles();	
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		uh.buttonClick();
	}
}
