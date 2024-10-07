package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	public void dashboard(WebDriver driver, WebDriverWait wait) {

		driver.get("https://app.dev.sharewithmarvin.io");

		AddConnection addconnections = new AddConnection();
		// CreateContent create = new CreateContent();

		addconnections.addconnection(driver, wait);
		// create.createcontent(driver, wait);

	}
}
