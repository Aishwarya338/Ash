import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoPage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Aishwarya/Desktop/Demo.html");
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.xpath("//select[@id='a']"));
		Select s = new Select(sel);
		//s.selectByValue("123");
		//s.selectByVisibleText("125");
		s.selectByIndex(3);
		
		WebElement sel1 = driver.findElement(By.xpath("//select[@id='b']"));
		Select s1 = new Select(sel1);
		if(s1.isMultiple())
		{
			//s1.selectByIndex(2);
			List<WebElement> vals = s1.getOptions();
			for(WebElement val : vals)
			{
				s1.selectByValue(val.getText());
				Thread.sleep(2000);
			}
		}
		//s1.deselectByIndex(2);
		System.out.println(s1.getFirstSelectedOption().getText());
		List<WebElement> opts = s1.getAllSelectedOptions();
		for(WebElement opt : opts)
		{
			System.out.println(opt.getText());
		}
		System.out.println(opts.size());
		s1.deselectAll();
	}

}
