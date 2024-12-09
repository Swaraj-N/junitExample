package demoTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserTest2 {
	
	@Test
	public void t21() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Gmail");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void t22() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/facebook");
		Thread.sleep(3000);
		driver.quit();
	}

}
