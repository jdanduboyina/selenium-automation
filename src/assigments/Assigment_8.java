package assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		//Thread.sleep(2000L);
		WebElement targetEle = driver.findElement(By.xpath("//ul[@id='ui-id-1']//li//div[text()='India']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(targetEle).click().build().perform();
		Thread.sleep(3000L);
		driver.quit();
	}

}
