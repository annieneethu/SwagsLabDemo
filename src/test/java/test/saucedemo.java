package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.CartPage;
import Page.CustomerInfoPage;
import Page.LoginPage;
public class saucedemo {

WebDriver driver;	
@BeforeTest
public void btest() {
driver=new ChromeDriver();
driver.get("https://www.saucedemo.com");
}

@Test
public void test() throws Exception {
	driver.manage().window().maximize();
	
	LoginPage ob=new LoginPage(driver);
	ob.logs("standard_user","secret_sauce");
	
	CartPage ob1=new CartPage(driver);
	ob1.addtocart();
	CustomerInfoPage ob2=new CustomerInfoPage(driver);
	ob2.cinfo("Annie", "Neethu", "378009");
	
 }
}
