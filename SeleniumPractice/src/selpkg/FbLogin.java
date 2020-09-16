package selpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../SeleniumPractice/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("email"));//finding the element by id
		user.sendKeys("Laveleenkaur.kaur@gmail.com");
		WebElement password=driver.findElement(By.name("pass"));//finding the element by name
		password.sendKeys("L@vleen7970");
		WebElement login=driver.findElement(By.cssSelector("button[name='login']"));//finding the element by css selector
		login.click();
	}

}
