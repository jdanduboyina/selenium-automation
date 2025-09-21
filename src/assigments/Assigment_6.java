package assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assigment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String strValue = driver.findElement(By.xpath("//input[@id='checkBoxOption2']//parent::label")).getText().trim();
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s = new Select(dropdownEle);
		s.selectByVisibleText(strValue);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(strValue);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String strText = driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim();
		Assert.assertEquals(strText, strValue);
		driver.quit();
	}

}
