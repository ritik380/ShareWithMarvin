package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTube {
	public void youtube(WebDriver driver, WebDriverWait wait) {
		WebElement Youtube = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[12]")));
		Youtube.click();
		SWMAutomation.waitFor(2000);

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channelName.sendKeys("YOUTUBE");
		SWMAutomation.waitFor(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email.sendKeys("rajh98069@gmail.com");
		
		WebElement Next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		Next.click();
		SWMAutomation.waitFor(2000);
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		Password.sendKeys("Password@100");
		SWMAutomation.waitFor(5000);
		
		WebElement login = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		login.click();
		SWMAutomation.waitFor(2000);
		
		WebElement permission = driver.findElement(By.xpath("//input[@id='i1']"));
		permission.click();
		SWMAutomation.waitFor(2000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		WebElement Continue = driver.findElement(By.xpath("//span[normalize-space()='Continue']")); 
		Continue.click();	
		
		WebElement ok = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
		ok.click();
		
	}
}
