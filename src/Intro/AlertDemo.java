package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.DriverInitialization;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = DriverInitialization.chromeDriverInitialization();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jagan");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jagan");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
