package testing.amazon01;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","\\Users\\Vijay Thorat\\Downloads\\chromedriver.exe");		
			
	    	WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("alertButton")).click();
			
        	Alert AlertHandling = driver.switchTo().alert();
			
			AlertHandling.accept();
			
						
			driver.findElement(By.id("timerAlertButton")).click();
			
			System.out.println("clicked on button");
			
			
			
			driver.findElement(By.id("confirmButton")).click();
			
		    
			String alertText = AlertHandling.getText();
		    System.out.println("Alert text is " + alertText);
		    
			AlertHandling.accept();
			
		
		  

	}

}
 