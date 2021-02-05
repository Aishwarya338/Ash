/*
Scenario:
 1: Open browser
 2: Load Flipkart.com
 3: Close the login pop-up
 4: Search for C# Book
 5: Sort the price from low to high
 6: Fetch the maximum rating book(by code)
 7: Click on book
 8: Switch the tab
 9: Click on add to cart button
*/
package Assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("C# Book",Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
        Thread.sleep(10000);
        List<WebElement> ele = driver.findElements(By.xpath("//span[@class='_1lRcqv']/div"));
        List<String> elements = new ArrayList<>();
        for(int i=0;i<ele.size();i++)
        {
        	elements.add(ele.get(i).getText());
        }
        Object max = Collections.max(elements);
        System.out.println("Maximum Rating: "+max);
        driver.findElement(By.xpath("//div[contains(.,'"+max+"')]/ancestor::div[@class='_4ddWXP']/a")).click();
		Set<String>wins= driver.getWindowHandles();	
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        Thread.sleep(2000);
    	System.out.println("Book Name: "+driver.findElement(By.xpath("//div[@class='_2-uG6-']/descendant::a")).getText());
       
	}

}
