package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tiktok {
	public void TikTok(WebDriver driver, WebDriverWait wait) {
		WebElement tiktok = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[10]")));
		tiktok.click();
		SWMAutomation.waitFor(2000);

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channelName.sendKeys("TIKTOK");
		SWMAutomation.waitFor(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Use phone / email / username')]"));
		login.click();
		SWMAutomation.waitFor(2000);

		WebElement changeToemail = driver
				.findElement(By.xpath("//a[normalize-space()='Log in with email or username']"));
		changeToemail.click();
		SWMAutomation.waitFor(2000);

		WebElement Emailplace = driver.findElement(By.xpath("//input[@placeholder='Email or username']"));
		Emailplace.sendKeys("ritik134raj@gmail.com");
		SWMAutomation.waitFor(2000);

		WebElement passwordplace = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordplace.sendKeys("Mdl@1212");
		SWMAutomation.waitFor(2000);

		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		loginbtn.click();
		SWMAutomation.waitFor(20000);
		
		

	}
}
