import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		
		driver.findElement(By.xpath("//*[@id='lilo3746-wrapper']/div/a")).click();
		

		
		
		
		WebElement product = driver.findElement(By.xpath("//header[@id='site-header']/div[3]/div/div/div/div[1]/a"));
		
		/*Actions action = new Actions(driver);
		
		action.moveToElement(product).perform();*/
		
		product.click();
		
		System.out.println("Product Name : " +driver.findElement(By.xpath("//a[@class='product-preview-title']/p/strong")).getText());
		
		driver.findElement(By.xpath("//main[@id='site-content']/div/div/div/div/div[4]/div/div/div/div[1]/div/div[2]/div[2]/span")).click();

	}

}