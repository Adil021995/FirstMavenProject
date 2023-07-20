package package1;

public class MainClass 
{
   public static void main(String[] args) throws Exception
   {
	   Signup obj1 = new Signup();
	   obj1.OpenUrl();
	   obj1.signup();
	   
	   Login obj2 = new Login();
	   obj2.login();
	   obj2.select();
	   
	   Select_Product obj3 = new Select_Product();
	   obj3.selectProduct();
	   
	   AddToCart obj4 = new AddToCart();
	   obj4.cart();
	   obj4.checkout();
	   
	   Payment obj5 = new Payment();
	   obj5.payment();
   }
}
