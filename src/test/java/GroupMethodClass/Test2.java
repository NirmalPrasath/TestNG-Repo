package GroupMethodClass;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	
	public void b1()
	{
		System.out.println("b1 " +"= " +  Thread.currentThread().getId());
	}

@Test

public void b2()
{
	System.out.println("b2 " +"= " +  Thread.currentThread().getId());
}

@Test

public void b3()
{
	System.out.println("b3 " +"= " +  Thread.currentThread().getId());
}


}
