package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UseFlipkart {
	@Test
	public void mouseOver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text() = '✕']").click();
		driver.findElementByXPath("//input[@class = 'LM6RPg']").sendKeys("mobile",Keys.ENTER);
		Thread.sleep(2000);
		WebElement min = driver.findElementByClassName("fPjUPw");
		Select dd = new Select(min);
		dd.selectByValue("2000");
		WebElement max = driver.findElementByXPath("(//select[@class = 'fPjUPw'])[2]");
		Select ds = new Select(max);
		ds.selectByValue("10000");
		
}
}
