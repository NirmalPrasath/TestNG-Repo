package TestNGTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("launchBrowser");

	}

	@Test(expectedExceptions = ArithmeticException.class, priority = 1)
	public void login() {
		System.out.println("login");
		int n = 10;

		System.out.println(n / 0);
	}

	@Test(priority = 3)
	public void home() {
		System.out.println("home");
	}

	@Test(priority = 2)
	public void card() {
		System.out.println("card");
	}

	@Test(priority = 4)
	public void transfer() {
		System.out.println("transfer");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Quit Browser");
	}

}
