package Intro;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//driver.findElement(By.xpath("//th[contains(@aria-label,'Veg/fruit name')]")).click();
		
		List<WebElement> tableEle = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> webTableEle = tableEle.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedTableEle = webTableEle.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(webTableEle.equals(sortedTableEle));
		driver.quit();
	}

}
