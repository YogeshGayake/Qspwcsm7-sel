package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(10000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123 ");
		driver.findElement(By.id("btnLogin")).click();
	}

}
