package zoom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zoomDemo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
	}
	
}
