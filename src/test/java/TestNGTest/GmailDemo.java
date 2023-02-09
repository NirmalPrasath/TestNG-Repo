package TestNGTest;

import org.testng.annotations.Test;

public class GmailDemo extends BaseClass {


	@Test
	public void title() {
		///driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void url() {

		System.out.println(driver.getCurrentUrl());
	}

	
}
