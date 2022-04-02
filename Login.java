package Week2Day2;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Login {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://acme-test.uipath.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
			driver.findElement(By.id("password")).sendKeys("leaf@12");
			driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
			driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			driver.manage().window().minimize();
			//driver.close();
}}

