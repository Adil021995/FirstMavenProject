package parametrizationDProvider;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrizationClass 
{
	String driverPath = "F:\\SELENIUM - jarfiles\\ChromeDriver\\chromedriver-win32\\chromedriver.exe";
	String baseUrl = "https://www.facebook.com/";
	public WebDriver driver;
	
	@BeforeClass
	public void OpningUrl()
	{
       System.setProperty("webdriver.chrome.driver", driverPath);
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get(baseUrl);      
	}
	
   @Test(dataProvider = "getData")
   public void setData(String emailvalue , String passvalue) throws Exception
   {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(emailvalue);
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys(passvalue);
	   
	   Thread.sleep(3000);
	   driver.navigate().refresh();
   }
   @DataProvider
   public Object[][] getData()
   {
	   Object[][] data = {
			               {"adilanwar@gmail.com" , "adil1234"} , 
			               {"amiranwar@gmail.com" , "amir4567"} , 
			               {"asadansari@gmail.com" , "asad8754"} , 
			               {"chandasd@gmail.com" , "chand7845"} , 
			               {"altaf@gmail.com" , "altaf5487"}
	                     };
	   
	   return data;
   }
}
