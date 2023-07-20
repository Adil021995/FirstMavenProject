package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Payment extends OpenUrl
{
  public void payment() throws Exception
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0 , 400)");
	  
	  Thread.sleep(3000);
	  List<WebElement> element1 = driver.findElements(By.xpath(pro.getProperty("Select1")));
	  String s1 = "MasterCard";
	  for(int i = 0; i < element1.size(); i++)
	  {
		  if(element1.get(i).getText().equalsIgnoreCase(s1))
		  {
			  element1.get(i).click();
		  }
	  }
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(pro.getProperty("CreditCard"))).clear();
	  driver.findElement(By.xpath(pro.getProperty("CreditCard"))).sendKeys(pro.getProperty("CreditCardValue"));
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(pro.getProperty("ExpirDate"))).clear();
	  driver.findElement(By.xpath(pro.getProperty("ExpirDate"))).sendKeys(pro.getProperty("ExpirDateValue"));
	  
	  Thread.sleep(3000);
	  jse.executeScript("window.scrollBy(0 , 400)");
	  
	  driver.findElement(By.xpath(pro.getProperty("ProceedButton"))).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(pro.getProperty("ConfirmButton"))).click();
	  
	  System.out.println("Product Purchase Successfully.....");
  }
}
