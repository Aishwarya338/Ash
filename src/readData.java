import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readData 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("E:\\Login.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Login");
		int rowCount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		for(int row=0;row<rowCount;row++)
		{
			for(int col=0;col<firstRow.getLastCellNum();col++)
			{
				Cell cl = sh.getRow(row).getCell(col);
				System.out.print(cl.toString()+"       ");
			}
			System.out.println();

		}
		
	}
}