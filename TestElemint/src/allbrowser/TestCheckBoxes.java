package allbrowser;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {
	public static WebDriver driver;
	public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			return false;
		}*/
		
		int size = driver.findElements(by).size();
		if(size==0) 
			return false;
		 else {
			return true;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		//driver.get("https://login.salesforce.com/");
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	/*	
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//div[4]/input[3]")).click();
		driver.findElement(By.xpath("//div[4]/input[4]")).click();
	*/	
		/*
		for(int i=1; i<=4; i++) {
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]")).click();
			
			System.out.println (driver.findElement(By.xpath("//div[6]/input["+i+"]")).isSelected());
			
		}
		
		
		
		int j=1;
		int count=0;
		while(isElementPresent(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+j+"]"))) {
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+j+"]")).click();
			j++;
			count++;
			
		}
		System.out.println("Total Checkbox are : "+count);
		*/
		/*int k=1;
		int counts=0;
		
		while(isElementPresent(By.xpath("//div[6]/input["+k+"]"))) {
			System.out.println(driver.findElement(By.xpath("//div[6]/input["+k+"]")).isSelected());
			k++;
			counts++;
			
		}
		System.out.println("Total Checkbox are : "+counts);*/
		
		
		
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		
		System.out.println("Total Checkboxssss are : "+checkboxes.size());
		
		for(WebElement checkboxs: checkboxes) {
			checkboxs.isSelected();
		}
		
		
		/*	
		System.out.println(driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[6]/input[1]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[6]/input[2]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[6]/input[3]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[6]/input[4]")).isSelected());
		
		
		for(int j=1; j<=4; j++) {
			System.out.println (driver.findElement(By.xpath("//div[6]/input["+j+"]"+j)).isSelected());

		}*/
		
	}

}
