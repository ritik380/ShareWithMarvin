package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Telegram {
	public void telegram(WebDriver driver, WebDriverWait wait) {
		WebElement premium = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[9]")));
		premium.click();
		SWMAutomation.waitFor(2000);

		WebElement channeInstancelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channeInstancelName.sendKeys("TELEGRAM");
		SWMAutomation.waitFor(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("channelInstanceConfig.configParams.0.parameterValue"))); 
		channelName.sendKeys("Testing_marv");

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		SWMAutomation.waitFor(5000);

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		
		WebElement ok = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
		ok.click();
	}
}
