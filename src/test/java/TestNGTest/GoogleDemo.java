package TestNGTest;
import org.testng.annotations.Test;

public class GoogleDemo extends BaseClass {

	

	@Test
	public void title() {
		//driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

	@Test
	public void url() {

		System.out.println(driver.getCurrentUrl());
	}

	

}
