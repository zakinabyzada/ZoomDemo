package zoom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zoomDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);

		WebElement radioBMW = driver.findElement(By.id("bmwRadio"));
		radioBMW.click();

		Thread.sleep(3000);
		driver.quit();
	}
	
}
