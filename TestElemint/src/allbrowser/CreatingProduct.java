package allbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatingProduct {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		driver.get("https://login.salesforce.com/");
		
		// WebElement username = driver.findElement(By.id("identifierId"));
		// WebElement username = driver.findElement(By.name("identifier"));
		//WebElement username = driver.findElement(By.cssSelector("#identifierId"));
		//username.sendKeys("jdakshini@gmail.com");
		//driver.wait(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//---------------------------------------//
		//FluentWait will wait and try every regular interval to find web element.  

		//		Wait wait = new FluentWait<WebDriver>(driver)
		//		.withTimeout(45, TimeUnit.SECONDS)
		//		.pollingEvery(5, TimeUnit.SECONDS)
		//		.ignoring(NoSuchElementException.class);
				
		//---------------------------------------//
		//		System.out.println(wait);
				
		// another way
		// driver.findElement(By.cssSelector("#identifierId")).sendKeys("jimmydakshini@gmail.com");
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
			//	System.out.println("after Fluent wait");
		// 1st way
		driver.findElement(By.id("username")).sendKeys("jdakshini@modeln.com");
		driver.findElement(By.id("password")).sendKeys("Testingteam@13");
		driver.findElement(By.id("rememberUn")).click();
		driver.findElement(By.id("Login")).click();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"01r61000000Ldm5_Tab\"]/a")).click();
		
		System.out.println("before wait");
		
		WebDriverWait wait1 = new WebDriverWait(driver,5);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"j_id0:j_id41:j_id42:mainForm:pblock:j_id100:j_id101\"]")));
		
		System.out.println("after wait");
		driver.findElement(By.xpath("//*[@id=\"j_id0:j_id41:j_id42:mainForm:pblock:j_id100:j_id101\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_id0:form:pb1:detailSection:j_id75:idField\"]")).sendKeys("jd_prod");
		driver.findElement(By.xpath("//*[@id=\"j_id0:form:pb1:detailSection:j_id79:0:j_id80:j_id83\"]")).sendKeys("jd_prod");
		driver.findElement(By.xpath("//*[@id=\"j_id0:form:pb1:detailSection:j_id79:2:j_id80:j_id86\"]")).sendKeys("Active");
		
		driver.findElement(By.xpath("//*[@id=\"j_id0:form:pb1:j_id63:bottom:saveBtn\"]")).click();
		
		//driver.close();
	}


		
	

}