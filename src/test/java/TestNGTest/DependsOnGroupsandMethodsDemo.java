package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnGroupsandMethodsDemo {
	
	
	
	@Test(groups= {"smoke"})
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test(groups={"smoke", "Functional", "Regression"})
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test(groups={"smoke", "Functional"})
	public void test3()
	{
		System.out.println("Test 3");
	}
	@Test(invocationCount=2,testName="NAME",groups="Functional")
	public void test4()
	{
		System.out.println("Test 4");
	}
	@Test(invocationCount=2,skipFailedInvocations=true, invocationTimeOut=10000, description="Test C5",groups= {"Functional", "Regression"})
	public void test5()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		System.out.println("Test 4");
	}
	
	@Test(enabled=false, groups= {"Regression"})
	public void test6()
	{
		System.out.println("Test 6");
	}
	
	@Test(groups= {"Regression"})
	public void test7()
	{
		System.out.println("Test 7");
	}
	
	
	

}
