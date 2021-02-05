package Demo.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class actiTimeDemo {
	@Test(dataProvider = "demo1", dataProviderClass = DemoReadData.class)
	public void tc(String user, String pass) {
		Reporter.log(user + " " + pass, true);
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(user);
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(pass, Keys.ENTER);
		driver.findElement(By.xpath("//a/div[contains(.,'Login')]")).click();
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.titleContains("Track"));
		driver.quit();
	}

}
