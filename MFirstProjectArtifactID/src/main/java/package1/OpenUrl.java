package package1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl 
{
   public String driverPath = "F:\\SELENIUM - jarfiles\\chrome-driver\\chromedriver.exe";
   public static WebDriver driver;
   public static Properties pro;
   public OpenUrl repo;
   
   public void OpenUrl() throws Exception
   {
	   repo = new OpenUrl();
	   
	   File src = new File("C:\\Users\\Adil Anwar\\maven-Project-workspace\\MFirstProjectArtifactID\\Object_Repo\\Repo.properties");
	   
	   FileInputStream fis = new FileInputStream(src);
	   
	   pro = new Properties();
	   pro.load(fis);
	   
	   System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   repo.openURL(driver , pro.getProperty("Url")); 
   }

	protected void openURL(WebDriver driver, String url)
	{	
	  	driver.get(url);
	}
   
}
