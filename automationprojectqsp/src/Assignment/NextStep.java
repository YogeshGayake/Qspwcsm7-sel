package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextStep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://nextstep.tcs.com/campus/#/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("loginID")).sendKeys("yogesh");	
		Thread.sleep(2000);
		driver.findElement(By.name("loginIDPasswrd")).sendKeys("yogesh123");
		Thread.sleep(2000);
		driver.findElement(By.className("greenButton")).click();

	}

}
