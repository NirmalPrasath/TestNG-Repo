package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTranformer {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void test3()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test6()
	{
		Assert.assertEquals(true, true);
	}
}
