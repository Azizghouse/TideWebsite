import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		
		driver.findElement(By.xpath("//div[@id='lilo3746-wrapper']/div/a")).click();
		
		driver.findElement(By.xpath("//header[@id='site-header']/div[1]/div/div/div/div[2]/span/a")).click();
		
		driver.findElement(By.xpath("//main[@id='site-content']/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a")).click();
		
		Set<String> ParentWindow = driver.getWindowHandles();
		
		
		Iterator<String> iterator = ParentWindow.iterator();
		String Pwindow = iterator.next(); 
		String Cwindow = iterator.next();
	
	   driver.switchTo().window(Cwindow);
	   
	   driver.findElement(By.xpath("//div[@id='scroll']/div/div/div/div/div[2]/form/div[7]/div/button")).click();
	   
	   driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("mdazizghouse786@gmail.com");
	   
	   driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Bajjiaziz@786");
	   
	   Thread.sleep(10000);
	   driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
	   
	   
	   
	}

}
