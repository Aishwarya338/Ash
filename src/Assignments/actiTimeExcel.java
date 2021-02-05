package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeExcel 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream fis = new FileInputStream("E:\\Login.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Login");
		int rowCount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		for(int row=0;row<rowCount;row++)
		{
			for(int col=0;col<firstRow.getLastCellNum();col++)
			{
				Cell cl = sh.getRow(row).getCell(0);				
				Cell c2 = sh.getRow(1).getCell(col);
				System.out.println(cl.toString().length());
			    driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(cl.toString());
			    driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(c2.toString(),Keys.ENTER);
			    Thread.sleep(2000);
			}
			System.out.println();

		}
		
	}

}
