package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormerlyTwitter {
	public void formelyTwitter(WebDriver driver, WebDriverWait wait) {
		WebElement Twitter = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[3]")));
		Twitter.click();
		SWMAutomation.waitFor(2000);
		
		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-6")));
		channelName.isDisplayed();
		channelName.isEnabled();
		channelName.sendKeys("TWITTER");
		SWMAutomation.waitFor(2000);
		
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		WebElement saveAndConnect = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username_or_email")));
		username.click();
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("ritik134raj");
		SWMAutomation.waitFor(2000);
		
		WebElement password = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.click();
		password.isSelected();
		password.sendKeys("Ritik@1010");
		SWMAutomation.waitFor(2000);
		
		WebElement authorizeapp = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.id("allow")));
		authorizeapp.click();
		SWMAutomation.waitFor(10000);
		
		/*WebElement verify = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username_or_email']")));
		verify.click();
		verify.isEnabled();
		verify.sendKeys("ritik134raj@gmail.com");
		
		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_challenge_submit")));
		submit.click();
		SWMAutomation.waitFor(5000);*/
		
		WebElement ok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
		ok.click();
		
	}
}
