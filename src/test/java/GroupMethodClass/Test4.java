package GroupMethodClass;

import org.testng.annotations.Test;

public class Test4 {
	
@Test
	
	public void d1()
	{
		System.out.println("d1 " + Thread.currentThread().getId());
	}

@Test

public void d2()
{
	System.out.println("d2 "+ Thread.currentThread().getId());
}

}
