package Demo.testng.annotations.Test;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	@DataProvider
	public static String[][] demo() {
		String[][] str = new String[3][2];
		str[0][0] = "UserA";
		str[0][1] = "A";
		str[1][0] = "UserB";
		str[1][1] = "B";
		str[2][0] = "UserC";
		str[2][1] = "C";
		return str;
	}

	@Test(dataProvider = "demo")
	public void tc(String user, String pass) {
		Reporter.log(user + " " + pass, true);
	}

}
