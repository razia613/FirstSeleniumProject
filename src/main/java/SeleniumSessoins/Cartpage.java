package SeleniumSessoins;

import org.openqa.selenium.By;

public class Cartpage {
	private By cart_page;
	public void printCart()
	{
		cart_page = By.id("cart_page");
		System.out.println("This is the Cart Page");
	}

}
