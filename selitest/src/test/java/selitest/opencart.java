package selitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencart {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver di = new ChromeDriver();
di.get("https://www.opencart.com/index.php?route=account/register");
WebElement web = di.findElement(By.id("input-username"));
web.sendKeys("tamil");
di.findElement( By.id("input-firstname")).sendKeys("tamilselvi");
di.findElement( By.id("input-lastname")).sendKeys("Mathesan");
di.findElement( By.id("input-email")).sendKeys("tamilselvimca@gmail.com");
Select drop = new Select( di.findElement( By.id("input-country")));
drop.selectByVisibleText("India");
di.findElement( By.id("input-password")).sendKeys("xxxxx");
System.out.println("hi how r u");
WebElement web1 = di.findElement(By.id("input-username"));
//web1.findElement(By.xpath("//*[@id=\"captcha-message\"]/div/strong/text()"));
//web1.findElement(By.xpath("//*[@id=\"captcha-message\"]/div/strong"));
String w1 = web1.findElement(By.xpath("//*[@id=\"captcha-message\"]/div/strong")).getText();
System.out.println("welcome : "+w1);

if(w1== "ShoppingCart")
{
	di.findElement( By.xpath("//*[@id=\"captcha-image\"]/ul/li[2]/a/img")).click();
	String w2 = web1.findElement(By.xpath("//*[@id=\"captcha-message\"]/div/text()")).getText();
if(w2==" Success: You passed!");
{
	System.out.println("test passed");
	}

}
}
}

