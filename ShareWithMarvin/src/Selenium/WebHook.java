package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebHook {
	public void webhook(WebDriver driver, WebDriverWait wait) {
		WebElement Webhook = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[11]")));
		Webhook.click();
		SWMAutomation.waitFor(2000);

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channelName.sendKeys("WEBHOOK");
		SWMAutomation.waitFor(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement url = driver.findElement(By.name("channelInstanceConfig.configParams.0.parameterValue"));
		url.sendKeys("https://webhook.site/26229104-8d35-4c82-a2d9-2f83d78899c9");

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);
		
		WebElement ok = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
		ok.click();
	}
}
