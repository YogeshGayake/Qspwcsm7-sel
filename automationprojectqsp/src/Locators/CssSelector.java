package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Yogesh");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("yogesh@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class^='sqdOP  ']")).click();
		

	}

}
