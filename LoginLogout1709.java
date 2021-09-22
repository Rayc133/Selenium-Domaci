package SeleniumOsnove;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Napisati program koji ucitava https://practicetestautomation.com/ stranicu, klikne na "Practice"
 *  i klikne na "Test login page", popunjava username i password (student/Password123),
 *   loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.
 */
public class LoginLogout1709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://practicetestautomation.com/");
		WebElement practiceDugme = driver1.findElement(By.xpath("//*[@id=\"menu-item-20\"]/a"));
		practiceDugme.click();
		WebElement testLoginPage = driver1.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		testLoginPage.click();
		WebElement userNameInput = driver1.findElement(By.id("username"));
		userNameInput.clear();
		userNameInput.sendKeys("student");
		WebElement passworInput = driver1.findElement(By.id("password"));
		passworInput.clear();
		passworInput.sendKeys("Password123");
		WebElement submitButton = driver1.findElement(By.id("submit"));
		submitButton.click();
		WebElement logOutButton = driver1.findElement(
				By.cssSelector("#loop-container > div > article > div.post-content > div > div > div > a"));
		logOutButton.click();
		driver1.close();

	}

}
