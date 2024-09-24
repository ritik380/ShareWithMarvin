package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public void loginUser(WebDriver driver, WebDriverWait wait) {

		driver.get("https://app.dev.sharewithmarvin.io/login");
		SWMAutomation.waitFor(5000);

		WebElement LoginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));
		LoginButton.click();
		SWMAutomation.waitFor(2000);

		WebElement EmailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		EmailAddress.isDisplayed();
		EmailAddress.isEnabled();
		EmailAddress.sendKeys("ritik.rajmandal+test@kune.consulting");
		SWMAutomation.waitFor(3000);

		WebElement ContinueAfterEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("action")));
		ContinueAfterEmail.click();
		SWMAutomation.waitFor(3000);

		WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		Password.isDisplayed();
		Password.isEnabled();
		Password.sendKeys("Password@100");
		SWMAutomation.waitFor(3000);

		WebElement ContinueAfterPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("action")));
		ContinueAfterPassword.click();
		SWMAutomation.waitFor(3000);

		WebElement ContinuewithoutPasskey = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Continue without passkeys']")));
		ContinuewithoutPasskey.click();
		SWMAutomation.waitFor(3000);

		WebElement welCome = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@class='relative md:pt-20 h-full bg-gray-light min-h-screen md:ml-64 main-content-transition']/div[@class='w-full']/main/div[@class='MuiContainer-root css-10ur324']/div/div[1]"));
		if (welCome.isDisplayed()) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Login failed.");
		}
	}
}
