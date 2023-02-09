package TestNGTest;

import org.testng.annotations.Test;

public class FacebookDemo extends BaseClass {

	

	@Test
	public void title() {
		//driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}

	@Test
	public void url() {

		System.out.println(driver.getCurrentUrl());
	}

	

}
