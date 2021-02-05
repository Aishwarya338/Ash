import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityDemo2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Aishwarya/Desktop/Selenium/HTML Files/ButtonClick.html");
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("otherBtn"))));
		driver.findElement(By.id("otherBtn")).click();
		ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sBtn"))));
		driver.findElement(By.id("sBtn")).click();
	}

}
