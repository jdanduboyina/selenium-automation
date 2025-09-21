package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Online 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement tableHeader = driver.findElement(By.xpath("//legend[contains(text(),'Web Table Fixed header')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", tableHeader);
		Thread.sleep(3000L);
		WebElement tableRow = driver.findElement(By.xpath("//legend[contains(text(),'Web Table Fixed header')]//following-sibling::div//td[contains(text(),'Mumbai')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", tableRow);
		Thread.sleep(3000L);
		
		// Course
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000L);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000L);
		driver.quit();
	}

}
