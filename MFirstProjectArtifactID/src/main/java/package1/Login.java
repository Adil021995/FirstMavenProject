package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Login extends OpenUrl
{
   public void login() throws Exception
   {
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("UserName"))).clear();
	   driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys(pro.getProperty("UserName_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Password"))).clear();
	   driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("Password_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Login_Button"))).click();
	   
	   System.out.println("Login Successfully");
   }
   
   public void select()
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(pro.getProperty("Select_Content"))).click();
   }
}
