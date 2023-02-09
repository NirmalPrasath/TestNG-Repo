package GroupMethodClass;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	
		public void a1()
		{
			System.out.println("A1 " + "= " + Thread.currentThread().getId());
		}
	
	@Test
	
	public void a2()
	{
		System.out.println("A2 " + "= " + Thread.currentThread().getId());
	}
	
}
