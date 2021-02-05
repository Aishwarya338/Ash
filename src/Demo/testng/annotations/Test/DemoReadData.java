package Demo.testng.annotations.Test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoReadData {
	@DataProvider
	public static String[][] demo1() throws Exception {
		String[][] str;
		FileInputStream fis = new FileInputStream("E:\\Write.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		str = new String[rowCount-1][firstRow.getLastCellNum()];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < firstRow.getLastCellNum(); j++) {
				str[i - 1][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return str;
	}

	@Test(dataProvider = "demo1")
	public void tc(String user, String pass) {
		Reporter.log(user + " " + pass, true);
	}
}
