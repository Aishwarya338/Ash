package Practice;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadPopUp 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.sodapdf.com/txt-to-pdf/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@aria-label='Choose file']")).click();
		Thread.sleep(2000);
		Runtime r = Runtime.getRuntime();
		r.exec("H:\\UploadDemo1.exe");
        
	}

}
