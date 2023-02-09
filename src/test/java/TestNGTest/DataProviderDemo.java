package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.util.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	WebDriver driver;
	@Parameters("url")
	@BeforeMethod
	public void launchBrowser(String url)
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.get("https://app.hubspot.com/login");
		
		driver.get(url);
		
	}
	
	@DataProvider
	public Object[][] getLoginData()
	{
		Object[][] data=UtilClass.sheetPath("login");
		return data;
		
	}
	
	
	@Test(dataProvider="getLoginData")
	public void loginTest(String uname, String password)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
