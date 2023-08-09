package seliniumpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\gekodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
         driver.get("https://www.google.com");
         Thread.sleep(3000);
         //driver.findElement(By.className("gLFyf gsfi")).sendKeys("Hi");
	}

}
