package TestNGTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.util.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {
	WebDriver driver;
	@BeforeMethod
	public void browserSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		
	}
	
	
	
	
	@Test(priority=1, enabled=false)
	public void dropdownHandeling()
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement droudownEle=driver.findElement(By.id("input-country"));
		Select ele=new Select(droudownEle);
		
		List<WebElement> lis=ele.getOptions();
		
		for(int i=0;i<lis.size();i++)
		{
			System.out.println(lis.get(i).getText());
			if(lis.get(i).getText().equals("Brazil"))
			{
				lis.get(i).click();
			}
		}
		
		
	}
	
	@Test(enabled=true)
	public void selectMethod() throws InterruptedException
	{
		WebElement droudownEle=driver.findElement(By.id("input-country"));
		Select ele=new Select(droudownEle);
		
		//ele.selectByVisibleText("Wallis and Futuna Islands");
		
		Thread.sleep(3000);
		
		//ele.selectByIndex(6);
		
		/*Thread.sleep(3000);
		
		ele.selectByValue("10");*/
		
		//UtilClass.selectClassDropdown(droudownEle, "Wallis and Futuna Islands");
		
		ele.getFirstSelectedOption();
		
	}
	
	
	
	@Test(enabled=false)
	public void dropDownwithoutSelectclass()
	{
		
		
		List<WebElement> lis=driver.findElements(By.xpath("//select[@id=\"input-country\"]/*"));
		
		for(WebElement e:lis)
		{
			System.out.println(e.getText());
		}
	}
	
	
	@Test(enabled=false)
	public void dropdownMenuButton()
	{
		
		driver.findElement(By.id("dropdownMenuButton")).click();
List<WebElement> lis=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		for(WebElement e:lis)
		{
			System.out.println(e.getText());
			if(e.getText().equals("Link 2"))
			{
				e.click();
			}
		}
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
		//driver.quit();
	}
	
	
}
