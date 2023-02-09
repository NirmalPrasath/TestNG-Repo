package GroupMethodClass;

import org.testng.annotations.Test;

public class Test3 {
	

	@Test
	
	public void c1()
	{
		System.out.println("c1 " +"= " +  Thread.currentThread().getId());
	}

@Test

public void c2()
{
	System.out.println("c2 "+ Thread.currentThread().getId());
}

@Test

public void c3()
{
	System.out.println("c3 "+ Thread.currentThread().getId());
}

}
