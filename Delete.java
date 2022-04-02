package Week2Day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Delete{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("10092")).click();
		driver.findElement(By.linkText("Delete")).click();
}
	}
