package selitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
 WebElement r =driver.findElement(By.name("q"));
 r.sendKeys("selinium");
 r.sendKeys(Keys.ENTER);
 
 driver.close();


	}

}
