import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		
		driver.findElement(By.xpath("//div[@id='lilo3746-wrapper']/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id='site-footer']/div[2]/div/div[4]/div[1]/a[4]/picture/img")).click();
		
		driver.findElement(By.xpath("//*[@id='__next']/div/header/div[2]/div/div/div[5]/div/a/span")).click();
		
		
		

	}

}

