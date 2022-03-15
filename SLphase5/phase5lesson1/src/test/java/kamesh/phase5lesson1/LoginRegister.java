package kamesh.phase5lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class LoginRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.geckodriver.driver","D:\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
//Register
driver.get("https://demo.wpjobmanager.com/my-account/");
driver.findElement(By.id("reg_email")).sendKeys("kameshabcd1@gmail.com");
driver.findElement(By.id("reg_password")).sendKeys("kameshgv123");
driver.findElement(By.name("register")).click();
driver.findElement(By.xpath("//*[@id=\"post-65\"]/div/div/div/p[1]/a")).click();

//Login

driver.findElement(By.id("username")).sendKeys("kameshabcd1@gmail.com");
driver.findElement(By.id("password")).sendKeys("kameshgv123");
driver.findElement(By.name("login")).click();
 }

}