package allbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillRegistrationForm {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		/*
		 * Navigate to Google
		 * Search way2automation 
		 * Click on 1st link on google
		 * print all link and count from way2automation webside
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		//driver.get("https://login.salesforce.com/");
		driver.get("https://www.qa.way2automation.com/");
		WebElement block = driver.findElement(By.xpath("//*[@id='load_form']"));
		driver.findElement(By.name("city")).sendKeys("fremont");
		driver.findElement(By.name("name")).sendKeys("JD");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input[2]")).click();
		
		driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
		
		//driver.findElement(By.xpath("//div[@id='load_box']/form[@id='load_form']/fieldset/input[@name='username']")).sendKeys("JD");

		//driver.findElement(By.xpath("//div[@id='load_box']/form/fieldset/input[@name='password']")).sendKeys("JD");

		//driver.findElement(By.xpath("//div[@id='load_box']/form/div/div/input[@type='submit']")).click();

		System.out.println("Successfully completed the execution");
		
	
	}
		
		
}
