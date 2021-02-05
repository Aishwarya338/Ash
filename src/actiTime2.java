import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
public class actiTime2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		//to check whether the page fully loaded or not
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				System.out.println(js.executeScript("return document.readyState").toString());
				boolean pgl=js.executeScript("return document.readyState").toString().equals("complete");
				return pgl;
			}
		});
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.xpath("//a/div[contains(.,'Login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'addTaskButtonId')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='dropdownButton']")).click();
		driver.findElement(By.xpath("//div[@class='searchItemList']/descendant::div[contains(.,'- New Customer -')]")).click();
		driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/descendant::div[contains(.,'Create Tasks')]")).click();
		WebElement err = driver.findElement(By.xpath("//span[contains(.,'Please correct all errors in the fields highlighted in red.')]"));
		//System.out.println("Error: "+err.getText());//Not Working
		System.out.println("Error: "+err.getAttribute("innerText"));	
	}
}
