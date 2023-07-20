package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Select_Product extends OpenUrl
{
   public void selectProduct() throws Exception
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(pro.getProperty("Select_Product"))).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("Select_Product2"))).click();
   }
}
