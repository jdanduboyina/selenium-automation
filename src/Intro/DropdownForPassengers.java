package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.DriverInitialization;

public class DropdownForPassengers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = DriverInitialization.chromeDriverInitialization();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
		Thread.sleep(2000L);
		int i = 1;
		while(i < 5) {
			driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@value=\"Done\"]")).click();
		System.out.println(driver.findElement(By.xpath(("//div[@id=\"divpaxinfo\"]"))).getText());

	}

}
