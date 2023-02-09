package TestNGTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo extends BaseClass {
	
@Parameters("url")
	@Test
	public void title(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
	}

	@Test
	public void url() {

		System.out.println(driver.getCurrentUrl());
	}


}
