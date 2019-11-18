package test.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEconfigure {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Naveen Raju\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
	WebDriver d=new InternetExplorerDriver();
	d.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
  WebElement us = d.findElement(By.xpath("//input[@autocomplete='username']"));
  us.sendKeys("nandhuguhan3094");
  WebElement btn = d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
  btn.click();
  WebElement pw = d.findElement(By.xpath("//input[@type='password']"));
  pw.click();
  WebElement btn1 = d.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
  btn1.click();
}
}
