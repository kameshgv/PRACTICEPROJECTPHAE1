package kamesh.phase5lesson2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void startbrowser()
	{
		System.setProperty("WebDriver.geckodriver.driver","D:\\geckodriver.exe");
	      driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
	}
	
	@Test(priority=1)
	public void login() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("abc@gmail.com");
		mail.submit();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("xy1245");
		driver.findElement(By.id("signInSubmit")).click();

		
	}
	@Test(priority=2)
	public void search() {
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iPhone 13");
		searchbox.submit();
		driver.findElement(By.linkText("Apple iPhone 13 (512GB) - Starlight")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='submit.add-to-cart']")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();

	

	}
	  @AfterMethod
	    public void tearDown() {
	    	driver.quit();
	    }
	
}
