package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadFlow extends HappyFlow {

	public void sadflow() {
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
	
	
	    driver.navigate().to("https://the-internet.herokuapp.com/login");
	    
	    WebElement username= driver.findElement(By.id("username"));
	    
	    username.clear();
	    username.click();
	    
	    username.sendKeys("tomsmith");
	    
	    WebElement password= driver.findElement(By.id("password"));
	    password.sendKeys("SuperSecretPasswo");
	    
	    WebElement login= driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		  login.click();
		  
		  WebElement provera= driver.findElement(By.id("flash"));
		  String provera1=provera.getText();
		  
		  if (provera1.contains("You logged into a secure area")) {System.out.println("PASS");}
		   else if (provera1.contains("Your password is invalid")) {System.out.println("FAIL Password is incorrect");}
		   else if (provera1.contains("Your username is invalid")) {System.out.println("FAIL Username is incorrect");}
		
		
	}
}
