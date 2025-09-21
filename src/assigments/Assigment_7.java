package assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> tableRows = driver.findElements(By.xpath("//legend[contains(text(),'Web Table Example')]//following-sibling::table//tr"));
		System.out.println("Table row :"+ tableRows.size());
		List<WebElement> tableColumns = driver.findElements(By.xpath("//legend[contains(text(),'Web Table Example')]//following-sibling::table//tr//th"));
		System.out.println("Table column :" + tableColumns.size());
		List<WebElement> tableEle = driver.findElements(By.xpath("//legend[contains(text(),'Web Table Example')]//following-sibling::table//tr[3]//td"));
		for(int i = 0; i< tableEle.size(); i++) {
			System.out.println(tableEle.get(i).getText());
		}
		driver.quit();
	}
}
