package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerInfoPage {

WebDriver driver;

By fname=By.id("first-name");
By lname=By.id("last-name");
By pcode=By.id("postal-code");
By con=By.id("continue");
By fin=By.id("finish");

public CustomerInfoPage(WebDriver driver) {
	this.driver=driver;
}

public void cinfo(String firstname, String lastname, String pincode) throws Exception {
	Thread.sleep(3000);
	driver.findElement(fname).sendKeys(firstname);
	driver.findElement(lname).sendKeys(lastname);
	driver.findElement(pcode).sendKeys(pincode);
	Thread.sleep(3000);
	driver.findElement(con).click();
	Thread.sleep(3000);
	driver.findElement(fin).click();
}
}
