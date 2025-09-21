package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		System.setProperty("webdriver.chrome.driver",
				"C:\\infor-taas\\Studio\\20.8.0\\studio_metadata\\browsers\\chrome\\drivers\\32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticWebEle = driver
				.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select staticdropdown = new Select(staticWebEle);

		staticdropdown.selectByIndex(3);
		System.out.println(staticdropdown.getFirstSelectedOption().getText());

		staticdropdown.selectByVisibleText("AED");
		System.out.println(staticdropdown.getFirstSelectedOption().getText());

		staticdropdown.selectByValue("INR");
		System.out.println(staticdropdown.getFirstSelectedOption().getText());

	}

}
