import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createNewAcc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		System.out.println(createNewAcc.isEnabled());
		if(createNewAcc.isEnabled())
			createNewAcc.click();
		Thread.sleep(3000);
		WebElement gender=driver.findElement(By.xpath("//label[contains(.,'Female')]"));
		Thread.sleep(2000);
		if(gender.isDisplayed())
			gender.click();
		System.out.println(gender.isSelected());
		System.out.println(gender.getCssValue("background-color"));
		System.out.println(gender.getRect().getPoint());
		Point loc = gender.getLocation();
		System.out.println("x: "+loc.getX()+"y: "+loc.getY());
		

	}

}
