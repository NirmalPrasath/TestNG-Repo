package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Before Hard Assert");
		Assert.assertEquals(true, true);
		System.out.println("After Hard Assert");
		
		SoftAssert softAssort=new SoftAssert();
		softAssort.assertEquals(false, true, "home page title is invalid");
		System.out.println("SoftAssert 1");
		softAssort.assertEquals(false, true, "transfer page title is invalid");
		System.out.println("SoftAssert 2");
		softAssort.assertEquals(false, true, "card page title is invalid");
		System.out.println("SoftAssert 3 ");
		
		softAssort.assertAll();
		
		
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssort1=new SoftAssert();
		softAssort1.assertEquals(true, true, "main page title is invalid");
		System.out.println("After Hard Assert");
		softAssort1.assertAll();
	}
	
	

}
