package GroupMethodClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallelExecution {
	
	
	
	
	@DataProvider(name="TestData", parallel=true)
	public Object[][] getData(){
		
		
		return new Object[][] {new Object[]{"user1", "password1"}, new Object[] {"user2", "password2"},new Object[]{"user3", "password3"}};
		
	}
	
	@Test(dataProvider= "TestData")
	public void loginTest(String uname, String password)
	{
		System.out.println("The Thread ID for Current Data" + uname + " and " + password + " " + Thread.currentThread());
		
	}
	
	
}
