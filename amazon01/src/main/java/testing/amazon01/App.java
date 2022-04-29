package testing.amazon01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	
	public static void main( String[] args )
    {

    	
        System.setProperty("webdriver.chrome.driver","\\Users\\Vijay Thorat\\Downloads\\chromedriver.exe");		
		
    	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]")).click();
        
		driver.manage().window().maximize();
        		
    
    }
}

