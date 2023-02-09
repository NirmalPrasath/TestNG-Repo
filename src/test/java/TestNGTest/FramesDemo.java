package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.util.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	static WebDriver driver;
	@BeforeMethod
	public void browserSetup()
	{
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	}
	
	@Test(priority=1)
	public void framesDemo()
	{
		WebElement frame1=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/input")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();	
		
	}
	
	@Test(priority=2)
	public static void NestedframesDemo()
	{
		WebElement ele=driver.findElement(By.xpath("//div[@class='tabpane']//li[2]/a"));
		ele.click();
		
		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame(0);
		
		UtilClass.framHandeling(driver, 1);
		
		UtilClass.framHandeling(driver, 0);
		
		WebElement e=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/input"));
		e.clear();
		e.sendKeys("Selenium");
		
	}

}
