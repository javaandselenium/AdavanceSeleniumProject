package dynamicwebtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement table = driver.findElement(By.xpath("//table[@class='data-list']"));
	List<WebElement> tabledata = driver.findElements(By.xpath("//td[text()='Java']/.."));
System.out.println(tabledata.size());
for(WebElement b:tabledata)
{
	System.out.println(b.getText());
}
driver.close();
	}

}
