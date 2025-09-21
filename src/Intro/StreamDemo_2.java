package Intro;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.DriverInitialization;

public class StreamDemo_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverInitialization.chromeDriverInitialization();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		
		try {
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			List<WebElement> rowEle;
			List<String> priceList;
			do {
				rowEle = driver.findElements(By.xpath("//tr/td[1]"));
				priceList = rowEle.stream().filter(s -> s.getText().contains("Cherry")).map(s -> getVeggiePrice(s)).collect(Collectors.toList());
				if(priceList.size() <= 0) {
					driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				}
				
			}while(priceList.size() <= 0);
			
			priceList.forEach(System.out::println);
		} finally {
			driver.quit();
		}
	}

	private static String getVeggiePrice(WebElement s) {
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
