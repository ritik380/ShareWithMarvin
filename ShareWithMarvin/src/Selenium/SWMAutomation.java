package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SWMAutomation {

	public static void main(String[] args) {

		// setting chromebrowser
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Users\\HP\\Selenium\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();

		// Set an implicit wait (applies to all element searches)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Set an explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Registration registration = new Registration();
		Login login = new Login();
		Dashboard dashBoard = new Dashboard();

		// registration.registeruser(driver, wait);
		SWMAutomation.waitFor(5000);

		login.loginUser(driver, wait);
		SWMAutomation.waitFor(3000);

		dashBoard.dashboard(driver, wait);
		SWMAutomation.waitFor(5000);

		// driver.quit(); 
	}

	public static void waitFor(int milliseconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(milliseconds); // Wait for the specified time in milliseconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
