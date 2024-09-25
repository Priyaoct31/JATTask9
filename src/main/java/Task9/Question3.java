package Task9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();			
		
		 driver.get("https://www.wikipedia.org/");

         // Maximize browser
         driver.manage().window().maximize();

         // input field locator
         WebElement searchInput = driver.findElement(By.id("searchInput"));

         // search query
         searchInput.sendKeys("Artificial Intelligence");

         // click the search option
         searchInput.submit();

         // Page loading time          
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         
         // Scroll to the History section & click
         WebElement historySection = driver.findElement(By.xpath("//span[text()='History']"));
         
         historySection.click();

         // Print the title 
         System.out.println("Title of the section: " + historySection.getText());
		
		
		
		
	}

}
