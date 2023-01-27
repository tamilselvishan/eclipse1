package selitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		String s = d.getTitle();
		System.out.println(s);
		if(s.equalsIgnoreCase("Google"))
		{
			System.out.println("Title is correct");
		}else
		{
			System.out.println("Title is incorrect");
		}
		String url=d.getCurrentUrl();
		if(url.contains("goog"))
		{
			System.out.println(" is correct");
		}else
		{
			System.out.println(" is incorrect");
		}

	}

}
