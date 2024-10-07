package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slack {
	public void slack(WebDriver driver, WebDriverWait wait) {
		WebElement premium = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[8]")));
		premium.click();
		SWMAutomation.waitFor(2000);

		WebElement channeInstancelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channeInstancelName.sendKeys("SLACK");
		SWMAutomation.waitFor(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("channelInstanceConfig.configParams.0.parameterValue"))); // channelInstanceConfig.configParams.0.parameterValue
		channelName.sendKeys("marvin-publishing-testing");

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		SWMAutomation.waitFor(5000);

		WebElement confirm = driver.findElement(By.xpath("//input[@value='No']"));
		confirm.click();
		SWMAutomation.waitFor(2000);

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);

		WebElement workspace = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("domain")));
		workspace.sendKeys("atomiselimited");
		SWMAutomation.waitFor(3000);

		WebElement Continue = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Continue']")));
		Continue.click();
		SWMAutomation.waitFor(3000);

		WebElement work_email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup_email")));
		work_email.sendKeys("ritik.rajmandal@atomise.com");
		SWMAutomation.waitFor(3000);

		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit_btn")));
		submit.click();
		SWMAutomation.waitFor(10000);

		WebElement allow = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Allow']")));
		allow.click();
		
		WebElement ok = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
		ok.click();

	}
}
