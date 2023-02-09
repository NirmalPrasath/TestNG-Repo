package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedCasesDemo {
	
	@Test(retryAnalyzer=com.test.util.UtilClass.class)
	public void test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}

}
