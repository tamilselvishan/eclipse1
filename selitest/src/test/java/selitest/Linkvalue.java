package selitest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkvalue {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
By loc = By.tagName("a");
List<String> name = mth2(loc);
System.out.println(name);


	}
	public static List<WebElement> getLinkName(By link){
		return driver.findElements(link);
	}
	
	public static ArrayList<String> mth2(By link1) {
		List<WebElement> ls = getLinkName(link1);
		ArrayList<String> a1 =new ArrayList<String>();
		for(WebElement s:ls)
		{
			String text =s.getText();
			if(!text.isEmpty())
			{
				a1.add(text);
			}
		}
		return a1;
	}

}
