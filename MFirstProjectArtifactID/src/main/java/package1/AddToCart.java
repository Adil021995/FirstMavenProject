package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AddToCart extends OpenUrl
{
   public void cart()
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(pro.getProperty("AddToCart"))).click();
   }
   public void checkout() throws Exception
   {
	   Thread.sleep(3000);
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Checkout"))).click();
	   
   }
}
