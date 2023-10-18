package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;
	By cart= By.id("add-to-cart-sauce-labs-backpack");
	By csymbol=By.className("shopping_cart_link");
	By cout=By.id("checkout");
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}

	public void addtocart() {
		
		driver.findElement(cart).click();
		driver.findElement(csymbol).click();
		driver.findElement(cout).click();
	}
}
