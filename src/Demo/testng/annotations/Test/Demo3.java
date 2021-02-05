//
package Demo.testng.annotations.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(groups = "smoke", priority = 3)
	public void tc() {
		Reporter.log("Hey...!", true);
	}

	@Test(groups = "regresion", dependsOnGroups = "functional")
	public void tc_1() {
		Reporter.log("1Hey...!", true);
	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc_2() {
		Reporter.log("2Hey...!", true);
	}

	@Test(groups = "smoke", priority = 2)
	public void tc_3() {
		Reporter.log("3Hey...!", true);
	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc_4() {
		Reporter.log("4Hey...!", true);
	}

	@Test(groups = "smoke", priority = 2)
	public void tc_5() {
		Reporter.log("5Hey...!", true);
	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc_6() {
		Reporter.log("6Hey...!", true);
	}
}
