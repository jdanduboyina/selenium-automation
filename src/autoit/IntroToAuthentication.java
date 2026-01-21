package autoit;

import org.openqa.selenium.WebDriver;

import utils.DriverInitialization;

public class IntroToAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = DriverInitialization.chromeDriverInitialization();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}

}
