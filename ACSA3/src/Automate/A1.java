package Automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/reports/reports.do");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[text()='Reports']")).click();
		driver.findElement(By.xpath("//span[text()='Create Chart']")).click();
	    WebElement chartName=driver.findElement(By.xpath("//div[.='Add to Dashboard']"));
	    chartName.click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Timing chart");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Save']")).click();
		driver.close();
		
		
		
	}

}
