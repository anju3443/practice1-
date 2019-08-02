package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicSeleniumcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// single line comment
		/*
		 * multi line comment
		 */
		
		//Initialize/instantiate/open browser
		//chrome browser
		system.Setproperty("webdriver.chrome.driver","C:\\Selenium Training\\Installation stuff\\Driver")
		WebDriver driver = new ChromeDriver();
		
		//close and quit command
		driver.close();//this will close the current active window
		driver.quit();// this will close all the window opened during this instance
		
		//get command
		driver.get("https://www.eudreka.co")//to open URL of AUT
		driver.gettitle();//to fetch the title of the page and use it either for validation
		driver.getcurrentURL();//to fetch the current URL of the AUT
		
		//navigation command
		//move to the next page
		driver.navigation().forward();
		//move to previous page
		driver.navigation().back();
		//page refresh
		driver.navigate().refresh();
		//element handling 
		//click
		driver.FindElement(by.id("")).click();
		//type
		driver.findElement(by.id("").sendkeys("anjana")
		//clear command
		driver.findElement(by.id("").clear();
				
		
		
		
		
	}

}
