package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public void fbpage(WebDriver driver, WebDriverWait wait) {

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

		WebElement selectFacebookPage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-channelType.id']//li[2]")));
		selectFacebookPage.click();
		SWMAutomation.waitFor(2000);

		WebElement channelName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		channelName.isDisplayed();
		channelName.isEnabled();
		channelName.sendKeys("FACEBOOK");
		SWMAutomation.waitFor(2000);

		/*
		 * WebElement dp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * cssSelector("button[class='MuiButtonBase-root MuiFab-root MuiFab-circular MuiFab-sizeLarge MuiFab-default MuiFab-root MuiFab-circular MuiFab-sizeLarge MuiFab-default text-white bg-blue absolute bottom-20 right-[-8px] css-18uv35s']"
		 * ))); dp.click();
		 * 
		 * WebElement browse =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * className("text-3xl text-blue")));
		 * 
		 * String imagePath =
		 * "C:\\Users\\Ritik raj\\Downloads\\pexels-junior-teixeira-2047905.jpg";
		 * 
		 * browse.sendKeys(imagePath);
		 */

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

		WebElement saveAndConnect = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save & Connect Now']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndConnect);
		SWMAutomation.waitFor(15000);

		WebElement fbUsername = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		fbUsername.click();
		fbUsername.isSelected();
		fbUsername.sendKeys("ritik134raj@gmail.com");

		WebElement fbPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		fbPassword.click();
		fbPassword.isSelected();
		fbPassword.sendKeys("ABC123abc");
		SWMAutomation.waitFor(2000);

		WebElement login = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginbutton']")));
		login.click();
		SWMAutomation.waitFor(2000);

		WebElement continueAs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']")));
		continueAs.click();
		SWMAutomation.waitFor(2000);

		WebElement selectProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				".MuiInputBase-root.MuiOutlinedInput-root.MuiInputBase-colorPrimary.MuiInputBase-fullWidth.MuiInputBase-formControl.MuiInputBase-adornedEnd.MuiAutocomplete-inputRoot.css-e3k1z2")));
		selectProfile.isDisplayed();
		selectProfile.click();
		SWMAutomation.waitFor(10000);

		WebElement profile = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Rooh']")));
		profile.click();
	}
}
