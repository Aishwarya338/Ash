import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		// Thread.sleep(1000);
		// driver.close();
		// System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		// FirefoxDriver b = new FirefoxDriver();

		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}
