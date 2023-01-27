package selitest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trailfb {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afew7MT14eUeMXlav-CEdtvdrXGGXZAMTJsBtpLHxrZKMnaups8Xh0Fw2OscRZn7cfc-QK9r32myna4tExyTZwGMiyamb-txAevAMLzwgr9A_Q&smuh=24420&lh=Ac9G3tAApTryHfvOAoY");
		driver.findElement(By.xpath("//a[@role=\"button\"][@data-testid=\"open-registration-form-button\"]")).click();
		Set<String> s = driver.getWindowHandles();
        Iterator<String> i = s.iterator();
	
	String ChildWindow = i.next();
	driver.switchTo().window(ChildWindow);
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("tamil");
	
		}

}
