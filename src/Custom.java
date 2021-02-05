import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custom 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Aishwarya/Desktop/Selenium/HTML Files/Sam1.html");
		new WebDriverWait(driver,10).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver arg0) {
				return driver.findElement(By.xpath("//div[1]/input[1]")).getAttribute("name").equals("textA");
			}
		});
		driver.findElement(By.name("textA")).sendKeys("ABC");
	}
}
