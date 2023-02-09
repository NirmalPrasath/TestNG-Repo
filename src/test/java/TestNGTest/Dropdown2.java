package TestNGTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {
	
	
	WebDriver driver;
	@Test
	public void browserSetup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		WebElement ele=driver.findElement(By.id("multiselect1"));
		
		Select el=new Select(ele);
		
		if(el.isMultiple())
		{
			System.out.println("MultiSelect box");
			el.selectByVisibleText("Hyundai");
			el.selectByVisibleText("Audi");
			
			Thread.sleep(10000);
			
			System.out.println(el.getFirstSelectedOption().getText());
			
			List<WebElement> elem=el.getAllSelectedOptions();
			for(WebElement we:elem)
			{
				System.out.println(we.getText());
			}
			Thread.sleep(10000);
			el.deselectAll();
			
			String ele1=driver.findElement(By.xpath("//input[@class='gsc-search-button']")).getAttribute("value");
			System.out.println(ele1);
			
		}
		
		
		
	}
	
	
	

}
