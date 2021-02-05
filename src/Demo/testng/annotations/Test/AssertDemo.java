package Demo.testng.annotations.Test;
 
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	public void tc() {
		String str = "ABC";
		String str1 = "ABC";
		Assert.assertEquals(str, str1);
		Reporter.log("Matched", true);

		List<Object> lst = new ArrayList<>();
		lst.add(true);
		lst.add("ABC");
		lst.add(99);
		lst.add(55.6);

		List<Object> lst1 = new ArrayList<>();
		lst1.add(true);
		lst1.add("ABC");
		lst1.add(99);
		lst1.add(55.6);
		// lst1.add(false);
		Assert.assertEquals(lst, lst1);
		Reporter.log("List Matched", true);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals("ABC", "ABC");
		Reporter.log("String Matched", true);
		sa.assertAll();
		Assert.fail();

	}

}
