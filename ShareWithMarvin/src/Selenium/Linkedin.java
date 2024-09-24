package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linkedin {
	public void linkedin(WebDriver driver, WebDriverWait wait) {
		WebElement LinkedIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[5]")));
		LinkedIN.click();
		
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
		
	}
}
