package dynamicwebtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement table = driver.findElement(By.xpath("//table[@class='data-list']"));
	System.out.println(table.getText());
	driver.close();
	}

}
