package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("youtube");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Music")).click();
	}

}
