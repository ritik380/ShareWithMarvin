package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpremium {
	public void Premium(WebDriver driver, WebDriverWait wait) {
		WebElement premium = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[7]")));
		premium.click();
		SWMAutomation.waitFor(2000);

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channelName.sendKeys("XPREMIUMS");
		SWMAutomation.waitFor(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(5000);
		
		WebElement account = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name']")));
		account.click();
		SWMAutomation.waitFor(2000);
		
		WebElement signOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign out']")));
		signOut.click();
		SWMAutomation.waitFor(3000);

		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username_or_email")));
		username.click();
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("TestingPremium");
		SWMAutomation.waitFor(2000);

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.click();
		password.isSelected();
		password.sendKeys("Marvin!23@");
		SWMAutomation.waitFor(2000);

		WebElement authorizeapp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allow")));
		authorizeapp.click();
		SWMAutomation.waitFor(10000);

		WebElement ok = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
		ok.click();
	}
}
