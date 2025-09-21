package Intro;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		
		driver.get("http://qaclickacademy.com/practice.php");
		List<WebElement> discountCoupons = driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//td[1]//a"));
		System.out.println(discountCoupons.size());
		String ctrlKey = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for(int i = 1; i < discountCoupons.size(); i++) {
			discountCoupons.get(i).sendKeys(ctrlKey);
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());	
		}
		driver.quit();
	}

}
