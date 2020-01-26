import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	@Test
	public void dologin()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://support.tricentis.com/community/webshop.do");
	//	driver.findElement(By.xpath("//*[@id=\"dropzone0_header\"]/div/div[5]/div/div/div[3]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("sakshi");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	
}
