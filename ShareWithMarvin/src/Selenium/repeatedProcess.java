package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class repeatedProcess {
	public void process(WebDriver driver, WebDriverWait wait) {
		WebElement addConnection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				".text-white.h-10[stroke='currentColor'][fill='currentColor'][stroke-width='0'][t='1569683928793']")));
		addConnection.click(); // CLICK ADD CONNECTION ICON
		SWMAutomation.waitFor(3000);

		WebElement selectCompany = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-component-select-companyId")));
		selectCompany.click();// CLICK TO SELECT COMPANY
		SWMAutomation.waitFor(3000);

		WebElement desireCompany = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-companyId']//li[3]")));
		desireCompany.click();
		SWMAutomation.waitFor(2000);

		WebElement selectChannel = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-component-select-channelType.id")));
		selectChannel.click();
		SWMAutomation.waitFor(2000);
	}
}
