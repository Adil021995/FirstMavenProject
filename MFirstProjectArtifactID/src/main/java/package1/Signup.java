package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Signup extends OpenUrl 
{
   public void signup() throws Exception
   {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Signup"))).click();
	   
	   Thread.sleep(3000);
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Username"))).sendKeys(pro.getProperty("Username_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("New_Password"))).sendKeys(pro.getProperty("New_Password_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Repeated_Password"))).sendKeys(pro.getProperty("Repeated_Password_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("First_Name"))).sendKeys(pro.getProperty("First_Name_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Last_Name"))).sendKeys(pro.getProperty("Last_Name_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("Email_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Phone"))).sendKeys(pro.getProperty("Phone_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Address1"))).sendKeys(pro.getProperty("Address1_Value"));
	   
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Address2"))).sendKeys(pro.getProperty("Address2_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("City"))).sendKeys(pro.getProperty("City_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("State"))).sendKeys(pro.getProperty("State_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Zip"))).sendKeys(pro.getProperty("Zip_Value"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Country"))).sendKeys(pro.getProperty("Country_Value"));
	   
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
       //-------------------------------------------------------------------------------------------------       
	   Thread.sleep(3000);
	   List<WebElement> lang = driver.findElements(By.xpath(pro.getProperty("Language")));
	   String s1 = "English";
	   for(int i = 0; i < lang.size(); i++)
	   {
		   if(lang.get(i).getText().equalsIgnoreCase(s1))
		   {
			   lang.get(i).click();
		   }
	   }
       //-------------------------------------------------------------------------------------------------	   
	   Thread.sleep(3000);
	   List<WebElement> fav = driver.findElements(By.xpath(pro.getProperty("Favourite")));
	   String s2 = "Dogs";
	   for(int i = 0; i < fav.size(); i++)
	   {
		   if(fav.get(i).getText().equalsIgnoreCase(s2))
		   {
			   fav.get(i).click();
		   }
	   }
       //-------------------------------------------------------------------------------------------------
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Enable_MyList"))).click();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Enable_MyBanner"))).click();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Signup_Button"))).click();
	   
	   System.out.println("Account created successfully.....");
   }
}
