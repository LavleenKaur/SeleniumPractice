package selpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","../SeleniumPractice/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement createacc=driver.findElement(By.id("u_0_2"));
	createacc.click();
	Thread.sleep(3000);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement fname=driver.findElement(By.name("firstname"));
	fname.sendKeys("Anne");
	WebElement lname=driver.findElement(By.name("lastname"));
	lname.sendKeys("Peterson");
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement email1=driver.findElement(By.id("u_1_g"));//id of email textbox
	email1.sendKeys("Anne95@gmail.com");
	WebElement email2=driver.findElement(By.id("u_1_j"));//id of email textbox
	email2.sendKeys("Anne95@gmail.com");
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement newpass=driver.findElement(By.name("reg_passwd__"));
	newpass.sendKeys("Anne@123");
	WebElement dobday=driver.findElement(By.id("day"));
	Select d=new Select(dobday);
	d.selectByIndex(10);//selecting date 10 by passing the index from dropdown
	WebElement dobmonth=driver.findElement(By.id("month"));
	Select m=new Select(dobmonth);
	m.selectByVisibleText("Jul");// selecting month July by passing the text from dropdown
    WebElement dobyear=driver.findElement(By.id("year"));
    Select y=new Select(dobyear);
    y.selectByValue("1995");//passing value 1995
    WebElement gender=driver.findElement(By.cssSelector("input[value='1']"));
    gender.click();
    WebElement signup=driver.findElement(By.name("websubmit"));
    signup.click();
}
}
