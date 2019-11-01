package allbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		//driver.get("https://login.salesforce.com/");
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int rownum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		int colnum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		
		System.out.println("Total numbers of rows: " + rownum);
		System.out.println("Total numbers of col: " + colnum);
		
		
		for(int r=1; r<=rownum; r++) {
			for(int c=1; c<=colnum; c++) {
				
				
				
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText()+"           ");
				
			}
			
			System.out.println();
			
		}

	}

}
