package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyFlow {

 public void happyFlow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("tomsmith");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("SuperSecretPassword!");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		loginbutton.click();
		WebElement logged = driver.findElement(By.id("flash"));

		String provera = logged.getText();
		
		if(provera.contains("You logged into a secure area!")) {
			System.out.println("ulogovani ste");
		}else {
			System.out.println("niste");
			
		}
 }
}
