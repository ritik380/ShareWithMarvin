package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {
	public void insta(WebDriver driver, WebDriverWait wait) {
		WebElement instagram = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[4]")));
		instagram.click();
		SWMAutomation.waitFor(2000);
		
		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-6")));
		channelName.isDisplayed();
		channelName.isEnabled();
		channelName.sendKeys("INSTAGRAM BUSINESS");
		SWMAutomation.waitFor(2000);
		
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		WebElement saveAndConnect = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);
		
		WebElement fbUsername = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		fbUsername.click();
		fbUsername.isSelected();
		fbUsername.sendKeys("ritik134raj@gmail.com");
		
		WebElement fbPassword = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		fbPassword.click();
		fbPassword.isSelected();
		fbPassword.sendKeys("ABC123abc");
		SWMAutomation.waitFor(2000);
		
		WebElement login = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginbutton']")));
		login.click();
		SWMAutomation.waitFor(2000);
		
		WebElement continueAs = wait.
				until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']")));
		continueAs.click();
		SWMAutomation.waitFor(2000);
	}
}
