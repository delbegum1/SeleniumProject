package Com.FirstMavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotestNG {
	WebDriver driver;
	@BeforeClass
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  

		driver=new ChromeDriver(); 
	}
	@Test	
	public void test2() throws InterruptedException {	
		driver.navigate().to("http://www.yahoo.com/");
	}
	@Test	
	public void test4() throws InterruptedException {	
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("New York");
		Thread.sleep(2000);
	}
	
	@AfterClass	
	public void test3() {
		driver.close();
	}




}


