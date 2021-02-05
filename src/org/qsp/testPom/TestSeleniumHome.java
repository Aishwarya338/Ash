/*
 Scenario:
 1: Launch browser
 2: Load URL
 3: Search java in search bar
 4: navigate back
 5: Search java in search testng
 */
package org.qsp.testPom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class TestSeleniumHome 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SeleniumHome sh = new SeleniumHome(driver);
        sh.sendText("Java");
		driver.navigate().back();
		sh.sendText("testNG");
	}

}
