package selitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methodweb {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		By loc = By.name("q");
		sendkey(loc,"selinium");
	}
	public static WebElement togetElement(By a)
	{
		return	driver.findElement(a);
				
	}
	public static void sendkey(By a,String s)
	{
		togetElement(a).sendKeys(s);
		
		
	}

}
