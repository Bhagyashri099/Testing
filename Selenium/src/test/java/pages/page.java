package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page 
{
	WebDriver driver;
	private final By LoginBtn= By.xpath("//button[contains(text(), 'Log in')]");
	private final By MobNo=By.xpath("//input[@placeholder='Enter Mobile Number']");
	
public void openbrower()
{
	driver=new ChromeDriver();
	driver.get("https://www.ixigo.com/");
	driver.manage().window().maximize();
}
public void entermobNum() throws InterruptedException
{
	driver.findElement(LoginBtn).click();
	Thread.sleep(3000);
	
}
}
