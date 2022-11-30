package Com.FirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassMaven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  
		
		WebDriver driver=new ChromeDriver();  
		
		//driver.get("https://google.com");//
		
		driver.navigate().to("http://www.yahoo.com/");
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("New York");
		Thread.sleep(2000);
		driver.close();
	}

}
