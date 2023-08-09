import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class NewAmazonWorkflow {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
		WebDriver  driver = new EdgeDriver();
		driver.get("https://www.amazon.com.au");
		//Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Trimmer");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"prime-day-hero-button\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ad\"]/div/div/div/div[3]/div[2]/div/div/div[3]/div/div/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
        driver.findElement(By.id("a-autoid-4-announce")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button-announce\"]/div/div[1]")).click();
        
	}

}
