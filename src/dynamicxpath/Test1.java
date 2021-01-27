package dynamicxpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		String productName="Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power Adapter)";
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	try {
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	catch(Exception e) {
		System.out.println("no popup appered");
	}
driver.findElement(By.name("q")).sendKeys("iphone xr");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//div[text()='+productName+']/../../../../a/div[2]/div[2]/div/div/div[3]/span")).click();
	

}
}