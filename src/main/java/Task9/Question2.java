package Task9;

import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();		
		
		
		System.out.println(title);
		
		if(title.equals("STORE")) {
			
			System.out.println("Page landed on correct website");
		}
		else {
			
			System.out.println("Page not landed on correct website");
		}
		
		
	}

}