package Task9;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		
		//Open firefox browser
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//launch url
		driver.get("http://google.com");
		
		//get the current url details
		System.out.println(driver.getCurrentUrl());
		
		//reload the page
		driver.navigate().refresh();
		
		//close the browser
		driver.close();
		
		

	}

}
