package demoTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserTest {
	
	@Test
	public void t1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Gmail");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void t2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/facebook");
		Thread.sleep(3000);
		driver.quit();
	}

}
