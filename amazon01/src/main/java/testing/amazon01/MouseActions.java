package testing.amazon01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","\\Users\\Vijay Thorat\\Downloads\\chromedriver.exe");		
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
		
    	driver.get("https://www.browserstack.com/");
    	Actions action = new Actions(driver); 
    	
    	
    	WebElement element = driver.findElement(By.linkText("Get started free"));

    	action.moveToElement(element).click().perform();
    	
    	
	}

}
