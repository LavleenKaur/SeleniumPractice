package selpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebpage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","../SeleniumPractice/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
}
}
