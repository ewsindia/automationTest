package testing.amazon01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.opentelemetry.sdk.logs.data.Body;

public class Dragable {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\Vijay Thorat\\Downloads\\chromedriver.exe");		
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
		
    	driver.get("https://demoqa.com/droppable");
    	
    	//WebElement on which drag and drop operation needs to be performed
    	
    	WebElement fromElement = driver.findElement(By.id("draggable"));

    	//WebElement to which the above object is dropped
    	
    	WebElement toElement = driver.findElement(By.id("droppable"));

    	//Creating object of Actions class to build composite actions
    	
    	Actions builder = new Actions(driver);

    	//Building a drag and drop action
    	Action dragAndDrop = builder.clickAndHold(fromElement)
    	.moveToElement(toElement)
    	.release(toElement)
    	.build();

    	
    	dragAndDrop.perform();
	}

}
