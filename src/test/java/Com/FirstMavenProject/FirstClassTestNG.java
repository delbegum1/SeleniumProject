package Com.FirstMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClassTestNG {

	@Test
	public void firstMethod() throws InterruptedException   {
		
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  
		
		WebDriver driver=new ChromeDriver();  
		Thread.sleep(3000);
		//driver.get("https://google.com");//
		
		driver.navigate().to("http://www.yahoo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("ybar-sbq")).sendKeys("New York");
		Thread.sleep(3000);
		driver.close();
	}

	
}
