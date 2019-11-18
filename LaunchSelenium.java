package test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen Raju\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		WebElement e = d.findElement(By.id("email"));
		boolean dis = e.isDisplayed();
		System.out.println(dis);
		boolean ena = e.isEnabled();
		System.out.println(ena);
		WebElement fe = d.findElement(By.xpath("(//input[@name='sex'])[1]"));
		boolean female = fe.isSelected();
		System.out.println(female);
		WebElement ma = d.findElement(By.xpath("(//input[@name='sex'])[2]"));
		ma.click();
		boolean male = ma.isSelected();
		System.out.println(male);
		d.quit();
			
	}

}
