package BrowserPkg;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testfirefox {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.chromedriver.driver", "Users/jdakshini⁩/eclipse-workspace⁩/Jars⁩/chromedriver");
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://google.com");
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("http://yahoo.com");
		

	}

}