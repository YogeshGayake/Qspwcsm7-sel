package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperSet {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.joinsuperset.com/#/s/feed");
		driver.findElement(By.name("email")).sendKeys("yogesh");	
		driver.findElement(By.name("password")).sendKeys("yogesh123");
		driver.findElement(By.className("btn btn-primary btn-block")).click();
		

	}

}
